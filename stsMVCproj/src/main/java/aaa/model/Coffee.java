package aaa.model;

import lombok.Data;

@Data
public class Coffee {
	String coffee, cnt;
	int price;
	
	public void setPrice(int price) {
		if(coffee.equals("아메리카노")) {
			this.price = 2200;
		}else if(coffee.equals("아프리카노")) {
			this.price = 2300;
		}else if(coffee.equals("아시아노")) {
			this.price = 2500;
		}
	}
}
