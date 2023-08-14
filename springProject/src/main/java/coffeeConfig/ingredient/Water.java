package coffeeConfig.ingredient;

public class Water {
	String name = "물";
	int capacity;
	
	public Water() {
		
	}
	
	public Water(int capacity) {
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
		return "Water [name=" + name + ", capacity=" + capacity + "]";
	}
}
