package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AwbMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/awb.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		KangBada kbd = context.getBean("kbd",KangBada.class);
		KangSan kgs = context.getBean("kangSan",KangSan.class);
		System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		System.out.println("-----------------------------------");
		System.out.println("jsk.wife:"+jsk.wife());
		System.out.println("-----------------------------------");
		System.out.println("jsk.papa:"+jsk.papa(44));
		System.out.println("-----------------------------------");
		kbd.dogdo();
		System.out.println("-----------------------------------");
		kgs.yunFish();
		System.out.println("-----------------------------------");
		kgs.ra9yo();
		System.out.println("-----------------------------------");
	}

}
