package mobile.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartPhoneMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/mobile.xml");
		
		System.out.println("어른폰: " + context.getBean("smp1"));
		System.out.println();
		System.out.println("은하수폰: " + context.getBean("smp2"));
		System.out.println();
		System.out.println("믹스폰: " + context.getBean("smp3"));
	}

}
