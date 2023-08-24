package aaa.controll;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.assignModel.Member;
import aaa.assignModel.MemberList;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping("login")
	ModelAndView login(
			@CookieValue(value = "id", required = false) String id,
			@CookieValue(value = "name", required = false) String name) {
		System.out.println("login");
		ModelAndView mav = new ModelAndView("loginCookie/login");
		
		System.out.println(id + ", " + name);
		
		mav.addObject("id", id);
		mav.addObject("name", name);
		
		return mav;
	}
	
	@RequestMapping("loginReg")
	String loginReg(
			Model md,
			HttpServletResponse response, 
			String id, 
			String pw) {
		System.out.println("loginReg");
		
		Member mb1 = new Member("aaa", "장동건", "1111");
		Member mb2 = new Member("bbb", "장서건", "2222");
		Member mb3 = new Member("ccc", "장둘건", "3333");
		Member mb4 = new Member("ddd", "장삼건", "2222");
		Member mb5 = new Member("eee", "장오건", "1111");
		
		MemberList mbList = new MemberList();
		
		mbList.setMemList(new HashMap<String, Member>(){{
			put("aaa", mb1); put("bbb", mb2); put("ccc", mb3);
			put("ddd", mb4); put("eee", mb5);
		}});
		
		if(mbList.getMemList().containsKey(id) && mbList.getMemList().get(id).getPw().equals(pw)) {
			response.addCookie(new Cookie("id", id));
			response.addCookie(new Cookie("name", mbList.getMemList().get(id).getName()));
			// System.out.println("걸림?");
			return "redirect:login";
		}
		
		return "loginCookie/loginReg";
	}
	
	@RequestMapping("logout")
	String logout(HttpServletResponse response) {
		System.out.println("logout");
		
		Cookie coo = new Cookie("id", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("name", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		return "redirect:login";
	}
}
