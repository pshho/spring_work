package studentAop;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Students {
	HashMap<String, Integer> subjects;
	
	@Bean
	Student std1() {
		subjects = new HashMap<>();
		subjects.put("국어", 77);
		subjects.put("수학", 89);
		return new Student("일", subjects);
	}
	
	@Bean
	Student std2() {
		subjects = new HashMap<>();
		subjects.put("국어", 57);
		subjects.put("수학", 61);
		return new Student("이", subjects);
	}
	
	@Bean
	Student std3() {
		subjects = new HashMap<>();
		subjects.put("국어", 34);
		subjects.put("수학", 46);
		subjects.put("영어", 98);
		return new Student("삼", subjects);
	}
	
	@Bean
	Student std4() {
		subjects = new HashMap<>();
		subjects.put("국어", 73);
		subjects.put("수학", 55);
		subjects.put("영어", 82);
		return new Student("사", subjects);
	}
	
	@Bean
	Student std5() {
		subjects = new HashMap<>();
		subjects.put("국어", 27);
		subjects.put("수학", 44);
		subjects.put("영어", 69);
		subjects.put("체육", 100);
		return new Student("오", subjects);
	}
	
	@Bean
	Student std6() {
		subjects = new HashMap<>();
		subjects.put("국어", 51);
		subjects.put("수학", 77);
		subjects.put("영어", 33);
		subjects.put("체육", 99);
		return new Student("육", subjects);
	}
}
