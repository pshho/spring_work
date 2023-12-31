package coffeeConfig.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeConfigMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/coffeeConfig.xml");
		
		System.out.println(context.getBean("americano"));
		System.out.println(context.getBean("cafeLatte"));
		System.out.println(context.getBean("caramelMacchiato"));
		
		context.close();
	}

}
