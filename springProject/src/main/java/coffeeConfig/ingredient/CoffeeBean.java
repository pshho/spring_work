package coffeeConfig.ingredient;

public class CoffeeBean {
	String name = "원두";
	String kinds;
	int capacity;
	
	public CoffeeBean() {
		
	}
	
	public CoffeeBean(String kinds, int capacity) {
		super();
		this.kinds = kinds;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "CoffeeBean [name=" + name + ", kinds=" + kinds + ", capacity=" + capacity + "]";
	}
}
