package coffeeAssignment.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coffeeAssignment.CoffeeStore;

public class coffeeComponentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/coffeeComponent.xml");
		
		for(Object cof : context.getBean("coffeeStore", CoffeeStore.class).getCoffees()) {
			System.out.println(cof);			
		}
		
		context.close();
	}

}
