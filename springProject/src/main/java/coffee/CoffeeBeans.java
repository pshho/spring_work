package coffee;

import java.util.Map;

public class CoffeeBeans {
	public Map<String, Integer> kindsPrice;

	public void setKindsPrice(Map<String, Integer> kindsPrice) {
		this.kindsPrice = kindsPrice;
	}
	@Override
	public String toString() {
		return "CoffeeBeans [kindsPrice=" + kindsPrice + "]";
	}
}
