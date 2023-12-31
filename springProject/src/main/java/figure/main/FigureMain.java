package figure.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import figure.Figures;
import figure.adv.FigureAdvice;

public class FigureMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/figure.xml");
		
		Figures fig = context.getBean("figures", Figures.class);
		FigureAdvice fa = context.getBean("figureAdvice", FigureAdvice.class);
		System.out.println("직사각형 넓이: " + fig.rectArea(5, 4));
		System.out.println("직사각형 둘레: " + fig.rectPerimeter(7, 8));
		System.out.println("직각삼각형 넓이: " + fig.rigTriArea(3, 6));
		System.out.println("직각삼각형 둘레: " + fig.rigTriPerimeter(6, 7, 8));
		System.out.println("원 넓이: " + fig.circleArea(11));
		System.out.println("원 둘레: " + fig.circlePerimeter(12));
		System.out.println("각 도형의 넓이 합계 : " + fa.getSumArea());
		System.out.println("각 도형의 둘레 합계 : " + fa.getSumPerimeter());
		System.out.println("각 도형의 넓이 평균 : " + fa.getAvgArea());
		System.out.println("각 도형의 둘레 평균 : " + fa.getAvgPerimeter());
	}

}
