package aaa.service;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;
import aaa.model.MenuData2;
import aaa.model.SeasonMain;

@Configuration
public class MyConfig {
	
	@Bean
	Battery bat1() {
		return new Battery("로케트밧데리", 500);
	}
	
	@Bean
	Battery bat2() {
		return new Battery("사랑의밧데리", 300);
	}
	
	@Bean
	SeasonMain spring() {
		return new SeasonMain("sp1.jpg,sp2.jpg,sp3.jpg".split(","));
	}
	
	@Bean
	SeasonMain summer() {
		return new SeasonMain("suma.png,sumb.png".split(","));
	}
	
	@Bean
	SeasonMain fall() {
		return new SeasonMain("at_1.jpg,at_2.jpg,at_5.jpg,at_6.jpg".split(","));
	}
	
	@Bean
	SeasonMain winter() {
		return new SeasonMain("ww.jpg,ee.jpg,wn.jpg".split(","));
	}
	
	@Bean("season")
	MenuData2 season() {
		return new MenuData2(
				new HashMap<>() {{
					put("distinct", "정렬"); put("spring", "봄");
					put("summer", "여름"); put("fall", "가을");
					put("winter", "겨울");
				}});
	}
}
