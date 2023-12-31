package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/component.xml");
		
		System.out.println("Mouse : " + context.getBean("mouse"));
		System.out.println("Notebook : " + context.getBean("notebook"));
		System.out.println("ComputerBody : " + context.getBean("bbcc"));
		System.out.println("DESKTop : " + context.getBean("DESKTop")); // 보통 첫글자 대문자 나머지 소문자인데 대문자로 계속 쓰면 대문자 명시해야함
		
		context.close();
	}

}
