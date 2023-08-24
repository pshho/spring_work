package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
	@RequestMapping("calc")
	String calc() {
		return "thymeleaf/calc";
	}
	
	@RequestMapping("control")
	String control(Model md) {
		md.addAttribute("arr", new int[] {33,11,55,88,55,77});
		md.addAttribute("pname", "장서건");
		md.addAttribute("pid", "qqq");
		return "thymeleaf/control";
	}
	
	@RequestMapping("lay")
	String lay(Model md) {
		System.out.println("lay");
		md.addAttribute("headerUrl", "hd_2");
		md.addAttribute("pid", "aaa");
		md.addAttribute("arr", new int[] {22,33,44,55});
		md.addAttribute("age", 36);
		return "thymeleaf/lalala";
	}
}
