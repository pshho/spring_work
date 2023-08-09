package bicycleComponent;

import java.util.Arrays;

import inter.Action;

public class MTBBicycle implements Action {
	String name;
	Handle hd;
	Wheel[] whs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Handle getHd() {
		return hd;
	}
	public void setHd(Handle hd) {
		this.hd = hd;
	}
	public Wheel[] getWhs() {
		return whs;
	}
	public void setWhs(Wheel[] whs) {
		this.whs = whs;
	}
	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", hd=" + hd + ", whs=" + Arrays.toString(whs) + "]";
	}
	@Override
	public void go() {
		System.out.println(name+"가 아주 빠르게 달립니다");
	}
	@Override
	public void repair(String fuel) {
		System.out.println(name+"를 고칠거에요\n"+"산악 자전거라 바퀴 값이 비싸요");
		System.out.println(name+"주제에 "+fuel+"가 필요해요");
	}
	@Override
	public void fall() {
		System.out.println(name+"는 쓰러지지 않아요");
	}
}
