package anno_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WashingMachine {
	String name;
	@Autowired
	@Qualifier("mt2")
	private Motor mt;
	Drum dr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Motor getMt() {
		return mt;
	}
	public Drum getDr() {
		return dr;
	}
	@Autowired(required = false)
	public void setDr(Drum dr) {
		this.dr = dr;
	}
	@Override
	public String toString() {
		return "WashingMachine [name=" + name + ", mt=" + mt + ", dr=" + dr + "]";
	}
}

class Motor{
	String name;
	int power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Motor [name=" + name + ", power=" + power + "]";
	}
}

class Drum{
	String name;
	int size;
	
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
		return "Drum [name=" + name + ", size=" + size + "]";
	}
}