package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;

public class AnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/aop_anno.xml");
		
		// System.out.println(context.getBeanDefinitionNames());
		JoSuk js = context.getBean("joSuk", JoSuk.class);
		System.out.println("-----------------------------------");
		System.out.println(js.dog1(2, "오토"));
		js.nums(0);
	}

}
