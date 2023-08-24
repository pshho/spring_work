package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.MenuData;
import aaa.service.MyProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("model/{season}")
public class ModelSeasonController {
	
	@Resource
	MyProvider provider;
	
//	@ModelAttribute("hNav")
//	Object headerNav() {
//		System.out.println("headerNav");
//		ArrayList<MenuData> res = new ArrayList<>();
//		res.add(new MenuData("distinct", "정렬"));
//		res.add(new MenuData("spring", "봄"));
//		res.add(new MenuData("summer", "여름"));
//		res.add(new MenuData("fall", "가을"));
//		res.add(new MenuData("winter", "겨울"));
//		
//		return res;
//	}
	
//	@Resource
//	SeasonMain sm;
//	
//	@ModelAttribute("mainCt")
//	Object mainContent(@PathVariable String season, @PathVariable String head) {
//		System.out.println("maincontent");
//		return sm.getPicture(head);
//	}
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		System.out.println("footerTxt");
		return "푸터푸터푸터푸터푸터";
	}

	@RequestMapping("{head}")
	String template(
			Model md,
			@PathVariable String season,
			@PathVariable String head) {
		System.out.println("template");
		md.addAttribute("hNav", provider.getContext().getBean(season));
		md.addAttribute("mainCt", provider.getContext().getBean(head));
		md.addAttribute("header", "header");
		return "model/template";
	}
}
