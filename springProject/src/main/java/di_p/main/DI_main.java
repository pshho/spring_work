package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Camera;
import di_p.HandPhone;

public class DI_main {
	public static void main(String[] args) {
		HandPhone hp1 = new HandPhone();
		Camera cm1 = new Camera("수중카메라", 800);
		// cm1.setName("전방카메라");
		// cm1.setPixel(1000);
		hp1.setName("은하수");
		hp1.setCam(cm1);
		
		System.out.println(hp1);
		System.out.println(cm1);
		System.out.println("----------------------------------------------------------");
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/first.xml");
		
		System.out.println("----------------------------------------------------------");
		HandPhone hp2 = (HandPhone)context.getBean("hp2");
		
		System.out.println(hp2);
		System.out.println(context.getBean("cm3"));
		System.out.println(context.getBean("cm4"));
	}
}
