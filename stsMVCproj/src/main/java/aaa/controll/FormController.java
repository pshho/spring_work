package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.Camping;
import aaa.model.MemData;
import aaa.model.Person;

@Controller
@RequestMapping("form")
public class FormController {

	@GetMapping("form")
	String form(MemData md) {
		return "form/form";
	}
	
	@GetMapping("campingSite")
	String camping(Camping cp) {
		return "form/campingSite";
	}
	
	@GetMapping("link")
	String link(Model md) {
		md.addAttribute("cate1", "eee");
		md.addAttribute("cate2", "fff");
		md.addAttribute("no", 2);
		md.addAttribute("age", 22);
		md.addAttribute("pname", "강하늘");
		md.addAttribute("gender", "남");
		md.addAttribute("id", "qwer");
		return "form/link";
	}
	
	@GetMapping("{cate}")
	@ResponseBody
	String link2(@PathVariable String cate, Person per) {
		String ttt = "cate : " + cate + "<br />";
		ttt += per + "";
		return ttt;
	}
	
	@GetMapping("{ct1}/{ct2}")
	@ResponseBody
	String link3(@PathVariable String ct1, @PathVariable String ct2,
			Person per) {
		String ttt = "cate : " + ct1 + " ser : " + ct2 + "<br />";
		ttt += per + "";
		return ttt;
	}
}
