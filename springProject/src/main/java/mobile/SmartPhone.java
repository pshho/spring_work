package mobile;

import java.util.List;

public class SmartPhone {
	String name;
	List<Camera> cam;
	Display disp;
	Battery bat;
	
	public SmartPhone() {
		System.out.println("기본 생성");
	}
	public SmartPhone(List<Camera> cam, Display disp, Battery bat) {
		super();
		System.out.println("생성자1");
		this.cam = cam;
		this.disp = disp;
		this.bat = bat;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCam(List<Camera> cam) {
		this.cam = cam;
	}
	public void setDisp(Display disp) {
		this.disp = disp;
	}
	public void setBat(Battery bat) {
		this.bat = bat;
	}
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ",\n cam=" + cam + ", disp=" + disp + ", bat=" + bat + "]";
	}
}
