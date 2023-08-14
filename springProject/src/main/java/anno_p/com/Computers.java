package anno_p.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import anno_p.com.sub1.Mouse;
import anno_p.comabc.Notebook;

@Configuration
public class Computers {
	// method를 bean으로 만듬
	@Bean
	Mouse hp920() {
		return new Mouse("HP920", "버티컬"); // Mouse 객체의 생성자 return method
	}
	
	@Bean
	Notebook gm1(){
		return new Notebook();
	}
	
	// bean 이름을 지정하면 method 명이 아니라 name으로 호출해야함
	@Bean(name = "nb")
	Notebook gm2(ComputerBody LG){
		Notebook res = new Notebook();
		res.setName("기가바이트");
		res.setBc(LG);
		return res;
	}
	
	@Bean
	Workstation ws1() {
		return new Workstation("델1", null, null, null, hp920());
	}
	
	@Bean
	Workstation ws2(ComputerBody LG, Mouse hp920) {
		return new Workstation("델1", LG, null, null, hp920);
	}
}
