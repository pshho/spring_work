package di_p;

import java.util.List;

public class AutoCar {
	String name;
	Engine eng;
	List<Wheel> whs;
	Handle handle;
	
	public AutoCar() {
		System.out.println("기본 생성자");
	}
	// 매개변수로 받을 때 에러가 발생되는 경우 동작 X
	public AutoCar(Engine eng, List<Wheel> whs, Handle hdd) {
		super();
		System.out.println("생성자1");
		this.eng = eng;
		this.whs = whs;
		this.handle = hdd;
	}
	// 생성자 실행 조건이 모두 충족할 경우 매개변수가 많은 생성자로 생성
	// 매개변수 할당 우선순위
	// 1. byName
	// 2. byType
	public AutoCar(Engine eng, Handle handle) {
		super();
		System.out.println("생성자2");
		this.eng = eng;
		this.handle = handle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public List<Wheel> getWhs() {
		return whs;
	}
	public void setWhsqwe(List<Wheel> whs) {
		this.whs = whs;
	}
	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	@Override
	public String toString() {
		return "AutoCar [name=" + name + ", eng=" + eng + ", whs=" + whs + ", handle=" + handle + "]";
	}
}

class Engine{
	String name, power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", power=" + power + "]";
	}
}

class Wheel{
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
		return "Wheel [name=" + name + ", size=" + size + "]";
	}
}

class Handle{
	String name, type;

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
		return "Handle [name=" + name + ", type=" + type + "]";
	}
	
}