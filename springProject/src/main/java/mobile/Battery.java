package mobile;

public class Battery {
	int size, capacity;

	public void setSize(int size) {
		this.size = size;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Battery [size=" + size + ", capacity=" + capacity + "]";
	}
}
