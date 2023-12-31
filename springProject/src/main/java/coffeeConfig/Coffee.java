package coffeeConfig;

import coffeeConfig.ingredient.Caramel;
import coffeeConfig.ingredient.CoffeeBean;
import coffeeConfig.ingredient.Milk;
import coffeeConfig.ingredient.Water;

public class Coffee {
	String name;
	CoffeeBean cfb;
	Water wa;
	Milk mik;
	Caramel crm;
	int price;
	
	public Coffee() {
		
	}
	public Coffee(String name, CoffeeBean cfb, Water wa, int price) {
		super();
		this.name = name;
		this.cfb = cfb;
		this.wa = wa;
		this.price = price;
	}
	public Coffee(String name, CoffeeBean cfb, Water wa, Milk mik, int price) {
		super();
		this.name = name;
		this.cfb = cfb;
		this.wa = wa;
		this.mik = mik;
		this.price = price;
	}
	public Coffee(String name, CoffeeBean cfb, Water wa, Milk mik, Caramel crm, int price) {
		super();
		this.name = name;
		this.cfb = cfb;
		this.wa = wa;
		this.mik = mik;
		this.crm = crm;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CoffeeBean getCfb() {
		return cfb;
	}
	public void setCfb(CoffeeBean cfb) {
		this.cfb = cfb;
	}
	public Water getWa() {
		return wa;
	}
	public void setWa(Water wa) {
		this.wa = wa;
	}
	public Milk getMik() {
		return mik;
	}
	public void setMik(Milk mik) {
		this.mik = mik;
	}
	public Caramel getCrm() {
		return crm;
	}
	public void setCrm(Caramel crm) {
		this.crm = crm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		String msg = null;
		if(mik == null && crm == null) {
			msg = "Coffee [name=" + name + ", cfb=" + cfb + ", wa=" + wa + ", price=" + price + "]";
		}else if(mik != null) {
			msg = "Coffee [name=" + name + ", cfb=" + cfb + ", wa=" + wa + ", mik=" + mik + ", price=" + price + "]";
		}else if(crm != null) {
			msg = "Coffee [name=" + name + ", cfb=" + cfb + ", wa=" + wa + ", crm=" + crm + ", price=" + price + "]";
		}
		
		return msg;
	}
}
