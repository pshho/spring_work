package bicycleComponent.main;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inter.Action;

public class BicycleMove {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/tBicycle.xml")) {
			String[] arr = {"thrBy","poBy","mtb"};
			String[] repair = {"츄파츕스","포카리","휘발유"};
			
			for(int i=0; i<arr.length; i++) {
				Action ars = context.getBean(arr[i], Action.class);
				ars.go();
				ars.repair(repair[i]);
				ars.fall();
				System.out.println();
			}
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
//		Action threeBycicle = (Action)context.getBean("thrBy");
//		Action poBycicle = (Action)context.getBean("poBy");
//		Action mtbBycicle = (Action)context.getBean("mtb");
//		System.out.println(threeBycicle);
//		System.out.println(poBycicle);
//		System.out.println(mtbBycicle);
	}

}
