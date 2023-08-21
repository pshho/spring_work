package aaa.assign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.Coffee;

@Controller
@RequestMapping("assignCoffee")
public class CoffeeController {
	@RequestMapping("coffee1")
	String coffee(
		@ModelAttribute("cof") Coffee cof
		) {
		
		return "coffee/coffee1";
	}
	
	@RequestMapping("coffeeOrd")
	String coffeeOrd(Model md,
			@RequestParam(value = "coffee") String coffee,
			@RequestParam(value = "cnt", defaultValue = "1") int cnt,
			@RequestParam(value = "price") int price
			) {
		
		md.addAttribute("coffee", coffee);
		md.addAttribute("cnt", cnt);
		md.addAttribute("price", price * cnt);
		return "coffee/coffeeOrd";
	}
}
