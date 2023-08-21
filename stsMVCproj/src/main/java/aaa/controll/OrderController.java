package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.OrderData;
import aaa.model.OrderProduct;

@Controller
@RequestMapping("request/order")
public class OrderController {
	@GetMapping
	String orderForm() {
		return "req/orderForm";
	}
	
	@PostMapping
	String orderReg(@ModelAttribute("od") OrderData orderData) {
		System.out.println(orderData);
		
		int sum = 0;
		for(OrderProduct o : orderData.getArr()) {
			sum += o.getTotal();
		}
		orderData.setSum(sum);
		return "req/orderReg";
	}
}
