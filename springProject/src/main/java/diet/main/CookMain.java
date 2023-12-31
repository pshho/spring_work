package diet.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diet.Cooking;

public class CookMain {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/dinner.xml","di_xml/dishMenu.xml");
		
		Cooking cook = context.getBean("dish", Cooking.class);
		System.out.println(cook.breakfast());
		System.out.println();
		System.out.println(cook.lunch());
		System.out.println();
		System.out.println(cook.dinner());
	}
}
