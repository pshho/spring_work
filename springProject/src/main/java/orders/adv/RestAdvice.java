package orders.adv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orders.order.Menu;
import orders.order.Restaurant;

@Service
@Aspect
public class RestAdvice {
	@Autowired
	Menu mu;
	
	@Autowired
	Restaurant rest;
	
	@Around("execution(public void orders.order.Food.menuAppend (..))")
	public void kindsAppend(ProceedingJoinPoint joinPoint) {
		// System.out.println("진입?" + joinPoint.getSignature().getName());
		try {
			joinPoint.proceed();
			
			mu.addMenu("한식");
			
			// System.out.println(mu);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Around("execution(public int orders.order.Restaurant.order (..))")
	public int order(ProceedingJoinPoint joinPoint) {
		// System.out.println("진입?" + joinPoint.getSignature().getName());
		Object args = null;
		int price = 0;
		try {
			args = joinPoint.proceed();
			if((int)args < 10000) {
				price += (int)args + rest.getDeliveryFee();
				System.out.println(rest.getDeliveryFee() + " 배송비");
				return price;
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return (int)args;
	}
}
