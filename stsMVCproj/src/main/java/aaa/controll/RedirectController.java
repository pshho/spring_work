package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.OrderAddr;
import aaa.model.Person;

@Controller
@RequestMapping("red")
public class RedirectController {
	@RequestMapping("from1")
	String from1() {
		System.out.println("from1() 진입");
		// redirect:주소 -> redirecting
		return "redirect:to";
	}
	
	@RequestMapping("to")
	String to() {
		System.out.println("to() 진입");
		return "red/to";
	}
	
	@RequestMapping("from2")
	String from2(Model md) {
		// model은 parameter 전달 못함
		System.out.println("from2() 진입");
		
		md.addAttribute("id", "bbb");
		md.addAttribute("age", 37);
		md.addAttribute("marriage", false);
		return "redirect:to";
	}
	
	@RequestMapping("from3")
	ModelAndView from3() {
		System.out.println("from3() 진입");
		ModelAndView mav = new ModelAndView();
		// ModelAndView는 redirect 요청도 param 전달 가능
		mav.setViewName("redirect:to");
		
		mav.addObject("id", "ccc");
		mav.addObject("age", 14);
		mav.addObject("marriage", true);
		
		// 기본 자료형, 문자열정도 가능
		// 인스턴스는 parameter 전달 불가
		OrderAddr addr = new OrderAddr();
		mav.addObject("addr", addr);
		return mav;
	}
	
	@RequestMapping("from4")
	String from4(String id, int age, boolean marriage) {
		System.out.println("from4() 진입 " + id + ", " + age + ", " + marriage);
		return "redirect:to?id="+id+"&age="+age+"&marriage="+marriage;
	}
	
	@RequestMapping("from5")
	String from5(String id, int age, boolean marriage) {
		System.out.println("from5() 진입 " + id + ", " + age + ", " + marriage);
		return "redirect:to";
	}
	
	@RequestMapping("from6")
	ModelAndView from6(Person per) {
		ModelAndView mav = new ModelAndView("redirect:to");
		
		// mav.setViewName("redirect:to");
		String id = per.getId();
		int age = per.getAge();
		boolean marriage = per.isMarriage();
		mav.addObject("id", per.getId());
		mav.addObject("age", per.getAge());
		mav.addObject("marriage", per.isMarriage());
		System.out.println("from6() 진입 " + id + ", " + age + ", " + marriage);
		
		return mav;
	}
}
