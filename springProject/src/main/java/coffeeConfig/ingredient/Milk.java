package coffeeConfig.ingredient;

public class Milk {
	String name = "우유";
	int capacity;
	
	public Milk() {
		
	}
	
	public Milk(int capacity) {
		super();
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Milk [name=" + name + ", capacity=" + capacity + "]";
	}
}
