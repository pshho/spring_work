package orders.main;

import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orders.order.Food;
import orders.order.Restaurant;

public class StoreMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/store.xml");
		
		Food kf = context.getBean("food", Food.class);
		Restaurant rest = context.getBean("restaurant", Restaurant.class);
		kf.menuAppend("찌개", 9000);
		kf.menuAppend("덮밥", 10000);
		kf.menuAppend("마파두부", 20000);
		kf.menuAppend("김밥", 3000);
		kf.menuAppend("라면", 4000);
		kf.menuAppend("꿔바로우", 25000);
		
		// System.out.println(kf);
		System.out.println(rest.order("한식", new HashMap<String, Integer>(){{ 
			put("찌개", 5); put("라면", 2); }}));
	}

}
