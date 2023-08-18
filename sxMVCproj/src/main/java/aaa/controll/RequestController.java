package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request")
public class RequestController {
	
	@RequestMapping("attr1")
	ModelAndView attr1() {
		System.out.println("attr1");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attr");
		mav.addObject("age", 29);
		mav.addObject("pname", "정우성");
		mav.addObject("jum", new int[] {78,89,34});
		mav.addObject("now", new Date());
		mav.addObject("per", new Person("장동건", "남", true));
		return mav;
	}
	
	@RequestMapping("attr2")
	String attr2(HttpServletRequest request) {
		System.out.println("attr2");
		request.setAttribute("age", 23);
		request.setAttribute("pname", "최태리");
		request.setAttribute("jum", new int[] {11,22,33,44,55});
		request.setAttribute("now", new Date());
		request.setAttribute("per", new Person("정좌성", "여", false));
		return "req/attr";
	}
	
	@RequestMapping("attr3")
	String attr3(Model mm) {
		System.out.println("attr3");
		mm.addAttribute("age", 17);
		mm.addAttribute("pname", "김아중");
		mm.addAttribute("jum", new int[] {99,88,77,66,55});
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("북두신건", "it", false));
		return "req/attr";
	}
	
	@RequestMapping("attr4")
	String attr4(Model mm,
			@ModelAttribute("age") int age,
			@ModelAttribute("nick") String pname,
			@ModelAttribute("jum") int[] jum) {
		System.out.println("age : " + age);
		System.out.println("nick : " + pname);
		System.out.println("jum : " + Arrays.toString(jum));
		System.out.println("attr4");
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("북두신건", "it", false));
		return "req/attr";
	}
	
	@RequestMapping("attrForm")
	String attrForm() {
		return "req/attrForm";
	}
	
	@RequestMapping("attrReg")
	String attrReg(
			@ModelAttribute("age") int age, 
			@ModelAttribute("pname") String pname, 
			@ModelAttribute("jum") int[] jum,
			String gender,
			boolean mil,
			Person Per) {
		System.out.println("age : " +  age);
		System.out.println("pname : " + pname);
		System.out.println("jum : " +  Arrays.toString(jum));
		System.out.println("gender : " +  gender);
		System.out.println("mil : " +  mil);
		System.out.println("per : " +  Per);
		
		return "req/attrReg";
	}
}
