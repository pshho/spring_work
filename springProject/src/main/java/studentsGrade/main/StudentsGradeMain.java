package studentsGrade.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentsGradeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/studentsGradeLifeCycle.xml");
		
//		String[] arr = "redbawee,red1232,blueagwegew,blue#@%#@,yellowwaeio".split(",");
//		
//		for(String ar : arr) {
//			System.out.println(context.getBean(ar));
//		}
		
		// String[] beans = context.getBeanDefinitionNames();

	}

}
