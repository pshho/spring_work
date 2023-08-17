package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AwbAdvice {
	void js(JoinPoint joinPoint) {
		System.out.println("js " + joinPoint.getSignature().toShortString());
	}
	
	void kkbbdd(JoinPoint joinPoint) {
		System.out.println("kkbbdd " + joinPoint.getSignature().toShortString());
	}
	
	void qw(JoinPoint joinPoint, int qq, String ww) {
		System.out.println("qw(int, string) " + joinPoint.getSignature().toShortString());
	}
	
	void zx(JoinPoint joinPoint, int zz, int xx) {
		System.out.println("zx(int, int) " + joinPoint.getSignature().toShortString());
	}
	
	void cccc(JoinPoint joinPoint, int cc) {
		System.out.println("cccc(int) " + joinPoint.getSignature().toShortString());
	}
}
