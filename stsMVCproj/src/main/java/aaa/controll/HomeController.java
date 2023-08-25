package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	String homeGo() {
		System.out.println("홈이다");
		return "home"; // views/home.html
		// yaml 설정 때문에 가능
	}
	
	@RequestMapping("admin/{ser}")
	@ResponseBody
	String adminGo(@PathVariable String ser) {
		System.out.println("admin");
		return "admin : " + ser + "페이지";
	}
}
