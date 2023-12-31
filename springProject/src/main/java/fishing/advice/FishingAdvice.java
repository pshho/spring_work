package fishing.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("fishAdv")
public class FishingAdvice {
	Object fishAdvice(ProceedingJoinPoint joinPoint) {
		Object rev = null;
		
		try {
			if((int)joinPoint.getArgs()[0] > 0) {
				if((int)joinPoint.getArgs()[0] > 4) {
					System.out.println("물고기를 잡는 중...");
					System.out.println("와! 물고기를 잡았다!");
					rev = joinPoint.proceed();
				}else {
					System.out.println("물고기를 잡는 중...");
					System.out.println("앗! 사이즈가 너무 작아");
					System.out.println("물고기를 풀어주자");
				}
			}else {
				System.out.println("미끼를 넣으세요");
				rev = "";
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return rev;
	}
}
