package coffee.lifecycle;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import coffee.Coffee;

public class CoffeeBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().getName().equals("coffee.Coffee")) {
			Coffee coff = (Coffee)bean;
			
			for(Map.Entry<String, Integer> cof : coff.cofs.entrySet()) {
				if(cof.getKey().equals("아샷추")) {
					System.out.print(cof);
					
					for(Map.Entry<String, Integer> co : coff.cfb.kindsPrice.entrySet()) {
						if(co.getKey().equals("에티오피아")) {
							System.out.print(" " + co);
						}
					}
					
					System.out.println(" " + coff.cfingre.kindsIngrePrice.get("액상류"));
				}
				
				if(cof.getKey().equals("꿀커피")) {
					System.out.print(cof);
					
					for(Map.Entry<String, Integer> co : coff.cfb.kindsPrice.entrySet()) {
						if(co.getKey().equals("콜롬비아")) {
							System.out.print(" " + co);
						}
					}
					
					System.out.print(" " + coff.cfingre.kindsIngrePrice.get("차류"));
				}
			}
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
}
