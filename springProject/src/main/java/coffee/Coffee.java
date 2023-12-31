package coffee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.Resource;

public class Coffee {
	public Map<String, Integer> cofs;
	@Autowired(required = false)
	public CoffeeBeans cfb;
	@Resource
	public CoffeeIngredient cfingre;
	
	public void setCofs(Map<String, Integer> cofs) {
		this.cofs = cofs;
	}
	@Override
	public String toString() {
		return "Coffee [cofs=" + cofs + ", cfb=" + cfb + ", cfingre=" + cfingre + "]";
	}
}

