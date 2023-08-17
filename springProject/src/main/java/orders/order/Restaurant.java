package orders.order;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	@Autowired
	Menu mu;
	
	int deliveryFee = 3000;
	
	public int getDeliveryFee() {
		return deliveryFee;
	}
	
	public int order(String kinds, Map<String, Integer> menu) {
		int price = 0;
		if(mu.getMenus().containsKey(kinds)) {
			Map<String, Integer> mmu = mu.getMenus().get(kinds);
			for(Map.Entry<String, Integer> muu : menu.entrySet()) {
				price += mmu.get(muu.getKey()) * muu.getValue();
			}
		}
		return price;
	}
}
