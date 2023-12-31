package coffeeAssignment.coffeeKinds;

import org.springframework.stereotype.Component;

@Component
public class CafeLatte {
	String name = "카페라떼";
	String kinds = "에티오피아";
	int coffeeBeans = 80;
	int water = 140;
	int milk = 180;
	int price = 3200;
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CafeLatte [name=" + name + ", kinds=" + kinds + ", coffeeBeans=" + coffeeBeans + ", water=" + water
				+ ", milk=" + milk + ", price=" + price + "]";
	}
}
