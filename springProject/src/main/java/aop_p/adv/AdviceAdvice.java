package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceAdvice {
	void beforeee(JoinPoint joinPoint) {
		System.out.println(">>>>> beforeee " + joinPoint.getSignature().toShortString());
	}
	
	void afterrrr(JoinPoint joinPoint) {
		System.out.println(">>>>> afterrrr " + joinPoint.getSignature().toShortString());
	}
	
	void afterreturning(JoinPoint joinPoint, Object qq) {
		System.out.println(">>>>> afterreturning " + joinPoint.getSignature().toShortString() + qq);
	}
	
	void errrrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println(">>>>> errrrr " + joinPoint.getSignature().toShortString() + ee.getMessage());
	}
}
