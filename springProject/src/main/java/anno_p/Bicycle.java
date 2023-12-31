package anno_p;

public class Bicycle {
	String name;
	BiHandle hd;
	BiWheel wh;
	
	public Bicycle() {
		
	}
	public Bicycle(String name, BiHandle hd, BiWheel wh) {
		super();
		this.name = name;
		this.hd = hd;
		this.wh = wh;
	}
	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", hd=" + hd + ", wh=" + wh + "]";
	}
	
}

class BiHandle{
	String name, type;
	
	public BiHandle() {
		
	}
	public BiHandle(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BiHandle [name=" + name + ", type=" + type + "]";
	}
}

class BiWheel{
	String name;
	int size;
	
	public BiWheel() {
		
	}
	public BiWheel(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "BiWheel [name=" + name + ", size=" + size + "]";
	}
}