package studentAop.adv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import studentAop.Student;

@Component
public class StudentAdvice {
	
	int stdCount1, stdCount2, stdCount3 = 0;
	float avgSum1, avgSum2, avgSum3 = 0;
	
	Object calc(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		try {
			res = joinPoint.proceed();
			
//			for(Student std : rev) {
//				if(std.getCategory().equals("뭐라고하는반")) {
//					stdCount1++;
//					avgSum1 += std.getAvg();
//				}else if(std.getCategory().equals("일반")) {
//					stdCount2++;
//					avgSum2 += std.getAvg();
//				}else if(std.getCategory().equals("예체능")) {
//					stdCount3++;
//					avgSum3 += std.getAvg();
//				}
//			}
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("뭐라고하는반 인원수 : " + stdCount1);
		System.out.println("일반 인원수 : " + stdCount2);
		System.out.println("예체능 인원수 : " + stdCount3);
		System.out.println("뭐라고하는반 평균 합계 : " + avgSum1);
		System.out.println("일반 평균 합계 : " + avgSum2);
		System.out.println("예체능 평균 합계 : " + avgSum3);
		System.out.println("뭐라고하는반 평균의 평균 : " + avgSum1 / stdCount1);
		System.out.println("일반 평균의 평균 : " + avgSum2 / stdCount2);
		System.out.println("예체능 평균의 평균 : " + avgSum3 / stdCount3);
		
		return res;
	}
}
