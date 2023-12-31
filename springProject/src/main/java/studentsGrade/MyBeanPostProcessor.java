package studentsGrade;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	HashMap<String, char[]> map;
	public MyBeanPostProcessor() {
		map = new HashMap<>();
		map.put("red", "가가가가가가양미우수수".toCharArray());
		map.put("blue", "FFFFFFDCBAA".toCharArray());
		map.put("yellow", "99876543211".toCharArray());
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization() 실행");
		// System.out.println("bean ? " + bean + " beanName ? " + beanName);
		
		if(bean.getClass().getName().equals("studentsGrade.Student")) {
			// System.out.println("실행됨?");
			Student std = (Student)bean;
			
//			if(beanName.matches("red(.*)")) {
//				char grades = "가가가가가가양미우수수".charAt(std.getAvg()/10);
//				std.setGrade(grades+"");
//			}else if(beanName.matches("yellow(.*)")) {
//				char grades = "99876543211".charAt(std.getAvg()/10);
//				std.setGrade(grades+"");
//			}else if(beanName.matches("blue(.*)")) {
//				char grades = "FFFFFFDCBAA".charAt(std.getAvg()/10);
//				std.setGrade(grades+"");
//			}
			
			for(Map.Entry<String, char[]> gra : map.entrySet()) {
				if(beanName.startsWith(gra.getKey())) {
					std.setGrade(gra.getValue()[std.getAvg()/10]+"");
				}
			}
			
			System.out.println(bean);
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// System.out.println("MyBeanPostProcessor.postProcessAfterInitialization() 실행");
		// System.out.println("bean ? " + bean + " beanName ? " + beanName);
		
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
