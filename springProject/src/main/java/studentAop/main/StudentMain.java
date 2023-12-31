package studentAop.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
//		ApplicationContext context =
//				new AnnotationConfigApplicationContext(Students.class);
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/studentAop.xml");
		
		System.out.println(context.getBean("std1"));
		System.out.println(context.getBean("std2"));
		System.out.println(context.getBean("std3"));
		System.out.println(context.getBean("std4"));
		System.out.println(context.getBean("std5"));
		System.out.println(context.getBean("std6"));
	}
}
