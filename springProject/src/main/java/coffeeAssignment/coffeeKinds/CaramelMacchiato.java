package coffeeAssignment.coffeeKinds;

import org.springframework.stereotype.Component;

@Component
public class CaramelMacchiato {
	String name = "카라멜 마끼야또";
	String kinds = "아라비카";
	int coffeeBeans = 70;
	int water = 110;
	int caramel = 150;
	int price = 3500;
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CaramelMacchiato [name=" + name + ", kinds=" + kinds + ", coffeeBeans=" + coffeeBeans + ", water="
				+ water + ", caramel=" + caramel + ", price=" + price + "]";
	}
}
