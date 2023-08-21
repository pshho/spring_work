package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Member;

@Controller
@RequestMapping("signUp")
public class SignUpController {

	@RequestMapping("sig")
	String signUp() {
		return "sign/sg";
	}
	
	@RequestMapping("sigReg")
	String signReg(
			@ModelAttribute("meb") Member member
			) {
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(pwCh);
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(gender);
		System.out.println(member);
		return "sign/sgView";
	}
}
