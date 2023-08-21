package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request")
public class ParamController {
	@RequestMapping("param1")
	String param1(HttpServletRequest req) {
		String str = "param" + req.getParameter("id");
		str += ", " + req.getParameter("age");
		str += ", " + req.getParameter("marriage");
		System.out.println(str);
		// param 없을 경우 null
		return "req/param";
	}
	
	@RequestMapping("param2")
	String param2(String id, int age, boolean marriage) {
		String str = "param" + id;
		str += ", " + age;
		str += ", " + marriage;
		System.out.println(str);
		// param이 없을 경우 에러 발생
		return "req/param";
	}
	
	@RequestMapping("param3")
	String param3(@RequestParam("id") String pid,
			@RequestParam("aaa") int age,
			@RequestParam("mrg") boolean marriage) {
		String str = "param" + pid;
		str += ", " + age;
		str += ", " + marriage;
		System.out.println(str);
		// param이 없거나 매개변수 이름이 일치하지 않으면 에러
		return "req/param";
	}
	
	@RequestMapping("param4")
	String param4(@RequestParam(value = "id", defaultValue = "qwer") String pid,
			@RequestParam(value = "aaa", required = false, defaultValue = "15") int age,
			@RequestParam(value = "mrg", defaultValue = "false") boolean marriage) {
		String str = "param" + pid;
		str += ", " + age;
		str += ", " + marriage;
		System.out.println(str);
		// 없으면 defaultValue값으로 들어옴
		return "req/param";
	}
}
