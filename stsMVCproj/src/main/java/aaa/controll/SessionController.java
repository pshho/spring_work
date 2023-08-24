package aaa.controll;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.assignModel.Member;
import aaa.assignModel.MemberList;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("session")
public class SessionController {
	@RequestMapping("make1")
	@ResponseBody
	String make1(HttpSession hs) {
		System.out.println("make1");
		hs.setAttribute("pname", "장동건");
		hs.setAttribute("no", 123.456);
		hs.setAttribute("arr", new int[] {33,55,11,99});
		hs.setAttribute("per", new Member("aa", "123", "멤버"));	
		return "세션 설정1";
	}
	
	@RequestMapping("view")
	String view(HttpSession hs) {
		System.out.println("view");
		System.out.println("pname " + hs.getAttribute("pname"));
		System.out.println("no " + hs.getAttribute("no"));
		System.out.println("arr " + Arrays.toString((int[]) hs.getAttribute("arr")));
		System.out.println("per " + hs.getAttribute("per"));
		
		return "session/view";
	}
	
	@RequestMapping("modify")
	@ResponseBody
	String modify(HttpSession hs) {
		System.out.println("modify");
		hs.setAttribute("pname", "장서건");
		hs.setAttribute("no", 234);
		hs.setAttribute("age", 12);
		
		return "세션 변경";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	String delete(HttpSession hs) {
		System.out.println("delete");
		hs.removeAttribute("pname");
		hs.removeAttribute("no");
		hs.invalidate();
		
		return "세션 삭제";
	}
	
	@RequestMapping("login")
	String login() {
		return "loginSession/login";
	}
	
	@RequestMapping("loginReg")
	String loginReg(
			Model md,
			HttpSession hs,
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
			hs.setAttribute("mem", mbList.getMemList().get(id));
			// System.out.println("걸림?");
			
			md.addAttribute("msg", mbList.getMemList().get(id).getName() + "님 로그인 성공");
		}else {
			md.addAttribute("msg", "로그인 실패");
		}
		
		
		return "loginSession/loginReg";
	}
	
	@RequestMapping("logout")
	String logout(
			Model md,
			HttpSession hs) {
		System.out.println("logout");
		Member mem = (Member)hs.getAttribute("mem");
		hs.invalidate();
		
		md.addAttribute("msg", mem.getName() + "님 로그아웃 되셨습니다");
		return "loginSession/loginReg";
	}
}
