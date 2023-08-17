package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

// @Component 가능하지만 용어의 편의상 Service 주로 사용
@Service
@Aspect
public class AnnoAdvice {
	@Before("execution(* aop_p.webToon..* (..))")
	void beforeee(JoinPoint joinPoint) {
		System.out.println(">>>>> beforeee " + joinPoint.getSignature().toShortString());
	}
	
	@Pointcut("execution(* aop_p.webToon..* (..))")
	void pppiii() {}
	
	@After("pppiii()")
	void afterrrr(JoinPoint joinPoint) {
		System.out.println(">>>>> afterrrr " + joinPoint.getSignature().toShortString());
	}
	
	@AfterReturning(pointcut = "pppiii()", returning = "qq")
	void afterreturning(JoinPoint joinPoint, Object qq) {
		System.out.println(">>>>> afterreturning " + joinPoint.getSignature().toShortString() + ", " + qq);
	}
	
	@AfterThrowing(pointcut = "pppiii()", throwing = "ee")
	void errrrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println(">>>>> errrrr " + joinPoint.getSignature().toShortString() + ee.getMessage());
	}
}
