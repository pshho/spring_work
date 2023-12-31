package schools.main;

import java.util.TreeSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inter.Quick;
import schools.Classes;
import schools.Student;

public class SchoolMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/schools.xml");
//		
//		Classes cla1 = context.getBean("classes1", Classes.class);
//		Classes cla2 = context.getBean("classes2", Classes.class);
//		System.out.println(cla1);
//		System.out.println(cla2);
		
		Classes cla1 = context.getBean("classes1", Classes.class);
		Classes cla2 = context.getBean("classes2", Classes.class);
		
//		int i = 1;
//		for(Student st : cla2.getStudents()) {
//			trS.add(st);
//			System.out.println(trS);
//			System.out.println(i+"번째 " + trS);
//			i++;	
//		}
//		for(Student st : cla1.getStudents()) {
//			trS.add(st);
//			System.out.println(i+"번째 " + trS);
//			i++;
//		}
		
//		for(Student cl : context.getBean("classes1", Classes.class).getSet()) {
//			System.out.println(cl);
//		}
		
		Quick<Student> qik = new Student();
		qik.quickDistinct(0, cla1.getStudents().size(), cla1.getStudents());
		
		for(int i=0; i<cla1.getStudents().size(); i++) {
			System.out.println(cla1.getStudents().get(i));
		}

	}

}
