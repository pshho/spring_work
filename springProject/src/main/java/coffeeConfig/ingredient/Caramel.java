package coffeeConfig.ingredient;

public class Caramel {
	String name = "카라멜";
	int capacity;
	
	public Caramel() {
		
	}
	
	public Caramel(int capacity) {
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
		return "Caramel [name=" + name + ", capacity=" + capacity + "]";
	}
}
