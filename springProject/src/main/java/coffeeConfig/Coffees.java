package coffeeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import coffeeConfig.ingredient.Caramel;
import coffeeConfig.ingredient.CoffeeBean;
import coffeeConfig.ingredient.Milk;
import coffeeConfig.ingredient.Water;

@Configuration
public class Coffees {
	@Bean
	Water wt1() {
		return new Water(240);
	}
	
	@Bean
	Water wt2() {
		return new Water(70);
	}
	
	@Bean
	CoffeeBean cfB1() {
		return new CoffeeBean("콜롬비아", 120);
	}
	
	@Bean
	CoffeeBean cfB2() {
		return new CoffeeBean("에티오피아", 60);
	}
	
	@Bean
	CoffeeBean cfB3() {
		return new CoffeeBean("아라비타", 80);
	}
	
	@Bean
	Milk mik1() {
		return new Milk(160);
	}
	
	@Bean
	Milk mik2() {
		return new Milk(120);
	}
	
	@Bean
	Caramel crm1() {
		return new Caramel(130);
	}
	
	@Bean
	Coffee americano(CoffeeBean cfB1, Water wt1){
		return new Coffee("아메리카노", cfB1, wt1, 1800);
	}
	
	@Bean
	Coffee cafeLatte(CoffeeBean cfB2, Water wt2, Milk mik1){
		return new Coffee("카페라떼", cfB2, wt2, mik1, 2700);
	}
	
	@Bean
	Coffee caramelMacchiato(CoffeeBean cfB3, Water wt2, Milk mik2, Caramel crm1){
		return new Coffee("카라멜 마끼야또", cfB3, wt2, mik2, crm1, 3400);
	}
}
