package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Member;
import aaa.model.Battery;
import aaa.model.Camera;
import aaa.model.Person;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("model")
public class ModelController {
	
	// 클래스 이름으로 나가기 때문에 중복 생성 X
	@ModelAttribute
	Person pp1() {
		return new Person("김태리", "여", false);
	}
	
	@ModelAttribute
	Person pp2() {
		return new Person("한효주", "여", true);
	}
	
	@ModelAttribute("pp3")
	Person pp3(int no) {
		System.out.println("pp3 : " + no);
		Person[] res = {
			new Person("gdm", "구동매", false),
			new Person("khs", "김하성", true),
			new Person("gas", "고애신", false)
		};
		
		return res[no-1];
	}
	
	// ﻿멤버변수에 직접 넣을 수 없음(Method필요)
	// @ModelAttribute
	@Resource
	Camera cam;
	
	@ModelAttribute
	Camera cm() {
		return cam;
	}
	
	@Resource
	Battery bat1;
	
	@ModelAttribute
	Battery bat11(Member mb) {
		return bat1;
	}
	
	@RequestMapping("mmm1")
	String mmm1(Model md) {
		md.addAttribute("ppp", "아이젠 소스케");
		return "model/mmm1";
	}
	
	@RequestMapping("mmm2")
	String mmm2() {
		return "model/mmm2";
	}
	
	@RequestMapping("mmm3")
	String mmm3(Model md) {
		md.addAttribute("ppp2", "내가 곧 하늘이다");
		return "model/mmm3";
	}
}
