package bicycleComponent;

import java.util.Arrays;

import move.Action;

public class ThreeBicycle implements Action {
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
		System.out.println(name+"가 천천히 가서 아이들이 좋아해요");
	}
	@Override
	public void repair(String candy) {
		System.out.println(name+"를 어릴 때만 타니까 그냥 쓰고 버려요");
		System.out.println(candy+"만 있으면 아이들은 날라다녀요");
	}
	@Override
	public void fall() {
		System.out.println(name+"로 쓰러지면 바보에요");
	}
}
