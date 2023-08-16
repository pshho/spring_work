package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ExecAdvice2 {
	void oAndKang(JoinPoint joinPoint) {
		System.out.println("ExecAdvice2 - oAndKang " + joinPoint.getSignature().toShortString());
	}
	
	void oOrJo(JoinPoint joinPoint) {
		System.out.println("ExecAdvice2 - oOrJo " + joinPoint.getSignature().toShortString());
	}
}
