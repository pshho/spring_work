package figure.adv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class FigureAdvice {
	private int sumArea = 0;
	private int sumPerimeter = 0;
	private double avgArea = 0;
	private double avgPerimeter = 0;
	private int count = 0;
	
	public int getSumArea() {
		return sumArea;
	}

	public int getSumPerimeter() {
		return sumPerimeter;
	}

	public double getAvgArea() {
		areaAvg();
		return avgArea;
	}

	public double getAvgPerimeter() {
		periAvg();
		return avgPerimeter;
	}

	Object calcRectTri(ProceedingJoinPoint joinPoint) {
		Object rev = null;
		
		String ptn1 = ".*Area";
		String ptn2 = ".*Perimeter";
		
		try {
			rev = joinPoint.proceed();
			if(joinPoint.getSignature().getName().matches(ptn1)) {
				if(joinPoint.getSignature().getName().startsWith("circle")) {
					areaCalc((int)Math.round((double)rev));
					count++;
				}else {
					areaCalc(Integer.parseInt(rev+""));
					count++;
				}
			}else if(joinPoint.getSignature().getName().matches(ptn2)) {
				if(joinPoint.getSignature().getName().startsWith("circle")) {
					periCalc((int)Math.round((double)rev));
				}else {
					periCalc(Integer.parseInt(rev+""));
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return rev;
	}
	
	void areaCalc(int area) {
		sumArea += area;
	}
	
	void periCalc(int area) {
		sumPerimeter += area;
	}
	
	void areaAvg() {
		avgArea = (double)sumArea/count;
	}
	
	void periAvg() {
		avgPerimeter = (double)sumPerimeter/count;
	}
}
