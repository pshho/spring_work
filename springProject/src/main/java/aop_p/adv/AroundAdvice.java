package aop_p.adv;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	Object arTest(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		// advice를 적용할 method의 이름을 알 수 있음(joinPoint가 진입된 method의 이름)
		System.out.println(" >> arTest 진입.toString : " + joinPoint.toString());
		System.out.println(" >> arTest 진입.toShortString : " + joinPoint.toShortString());
		System.out.println(" >> signature : " + joinPoint.getSignature()); // Method의 이름, 매개 변수 유형 및 반환 유형 등
		System.out.println(" >> signature.getName : " + joinPoint.getSignature().getName()); // Method 이름
		System.out.println(" >> signature.toShortString : " + joinPoint.getSignature().toShortString()); // 클래스.Method
		System.out.println(" >> target : " + joinPoint.getTarget()); // 클래스의 method의 주소(같은 주소)
		System.out.println(" >> args : " + Arrays.toString(joinPoint.getArgs())); // 매개변수 들어온 데이터 값
		System.out.println(" >> this : " + joinPoint.getThis()); // 클래스의 method의 주소(같은 주소)
		
		// joinPoint.proceed로 검사하는 method를 실행시킬 수 있음
		try {
			if(joinPoint.getArgs().length >= 2) {
				joinPoint.getArgs()[1] = "엄마상어";
				System.out.println(" >> 변경한 args " + Arrays.toString(joinPoint.getArgs()));
			}
			res = joinPoint.proceed();
			
			// method의 실제 로직은 못바꾸지만 실행 후의 return은 바뀔 수 있음
			if(res.equals("애봉")) {
				res = "조준";
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println(" >> arTest 진입 완료");
		
		return res;
	}
}
