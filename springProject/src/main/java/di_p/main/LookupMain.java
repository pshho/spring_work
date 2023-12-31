package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.CoffeeShop;

public class LookupMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/lookup.xml");
		
		CoffeeShop cof1 = context.getBean("cof1", CoffeeShop.class);
		
		System.out.println("order_am" + cof1.order_am());
		System.out.println("order_tea" + cof1.order_tea());
		
		// System.out.println("order_private" + cof1.order_private()); // private 접근 불가
		System.out.println("order_private2" + cof1.order_private2());
		
		// private, final, static > lookup method 적용 X 클래스에 정의된 method만 가능
		System.out.println("order_final" + cof1.order_final());
		System.out.println("order_static" + cof1.order_static());
		System.out.println("order_piano" + cof1.order_piano());
		
		// 추상 method를 lookup-method로 재정의
		System.out.println("order_hunter" + cof1.order_hunter());
		
		// 추상 method 재정의 안할 시 error 
		// System.out.println("order_latte" + cof1.order_latte());
		
		cof1.order_void();
		
//		Coffee cof2 = context.getBean("cof2", Coffee.class);
//		
//		System.out.println("cof2" + cof2);
		
		/*
		 * 식단표의 식단을 xml에 지정
		 * 
		 * 식단표
		 * 아침, 점심, 저녁
		 * xml에서 각 식단대로 메뉴를 리턴
		 * 
		 * 메뉴
		 * 밥, 국, 반찬
		 * */
		
		
	}

}
