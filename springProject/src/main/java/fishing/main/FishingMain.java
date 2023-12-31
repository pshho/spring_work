package fishing.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fishing.fish.Fishing;

public class FishingMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/fishing.xml");
		
		Fishing fish = context.getBean("fishing", Fishing.class);
		
		fish.seaFish();
		System.out.println(fish.seaFishing(6));
	}

}
