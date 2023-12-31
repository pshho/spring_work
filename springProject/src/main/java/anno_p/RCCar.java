package anno_p;

import jakarta.annotation.Resource;

public class RCCar {
	String name;
	@Resource
	Motor mt;
	@Resource(name="rwh")
	RCWheel rw1;
	RCWheel rw2, rw3, rw4;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMt(Motor mt) {
		this.mt = mt;
	}
	public void setRw1(RCWheel rw1) {
		this.rw1 = rw1;
	}
	public void setRw2(RCWheel rw2) {
		this.rw2 = rw2;
	}
	public void setRw3(RCWheel rw3) {
		this.rw3 = rw3;
	}
	public void setRw4(RCWheel rw4) {
		this.rw4 = rw4;
	}
	@Override
	public String toString() {
		return "RCCar [name=" + name + ", mt=" + mt + ", rw1=" + rw1 + ", rw2=" + rw2 + ", rw3=" + rw3 + ", rw4=" + rw4
				+ "]";
	}
}

class RCWheel{
	String name;
	int size;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "RCWheel [name=" + name + ", size=" + size + "]";
	}
}