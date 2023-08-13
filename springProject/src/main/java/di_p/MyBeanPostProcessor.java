package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization() 실행");
		// System.out.println("bean ? " + bean + " beanName ? " + beanName);
		
		if(bean.getClass().getName().equals("di_p.Umbrella")) {
			// System.out.println(bean + "우산 ? Before");
			// System.out.println("우산 ?");
			Umbrella umb = (Umbrella)bean;
			
			if(umb.getPrice()>=5000) {
				umb.setType("비싸");	
			}
		};
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("MyBeanPostProcessor.postProcessAfterInitialization() 실행");
		// System.out.println("bean ? " + bean + " beanName ? " + beanName);
		
		if(bean.getClass().getName().equals("di_p.Coffee")) {
			System.out.println(bean + "커피 ? After");
			// System.out.println("우산 ?");
			Coffee cof = (Coffee)bean;
			
			if(cof.getPrice()>=5000) {
				cof.setType("비싸");	
			}
		};
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
