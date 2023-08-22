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
}
