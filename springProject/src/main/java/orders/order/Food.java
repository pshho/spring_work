package orders.order;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Food {
	Map<String, Integer> menu = new HashMap<>();
	
	public Map<String, Integer> getMenu() {
		return menu;
	}

	public void menuAppend(String menu, int price) {
		this.menu.put(menu, price);
	}

	@Override
	public String toString() {
		return "Food [menu=" + menu + "]";
	}
}
