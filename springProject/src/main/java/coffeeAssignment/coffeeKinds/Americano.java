package coffeeAssignment.coffeeKinds;

import org.springframework.stereotype.Component;

@Component
public class Americano {
	String name = "아메리카노";
	String kinds = "콜롬비아";
	int coffeeBeans = 70;
	int water = 180;
	int price = 2000;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Americano [name=" + name + ", kinds=" + kinds + ", coffeeBeans=" + coffeeBeans + ", water=" + water
				+ ", price=" + price + "]";
	}
}
