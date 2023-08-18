package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	String homeGo() {
		System.out.println("홈이다");
		return "home"; // views/home.html
		// yaml 설정 때문에 가능
	}
}
