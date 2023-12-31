package bicycleComponent;

import java.util.Arrays;

import inter.Action;

public class PokaBicycle implements Action {
	String name;
	Handle hd;
	Wheel[] whs;
	Basket bk;
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
	public Basket getBk() {
		return bk;
	}
	public void setBk(Basket bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", hd=" + hd + ", whs=" + Arrays.toString(whs) + ", bk=" + bk + "]";
	}
	@Override
	public void go() {
		System.out.println(name+"가 맛있는 느낌의 자전거가 굴러가요");
	}
	@Override
	public void repair(String poka) {
		System.out.println(name+"는 포카리만 있으면 고쳐져요");
		System.out.println(poka+"가 들어왔어요!\n다시 쌩쌩해졌어요");
	}
	@Override
	public void fall() {
		System.out.println(name+"는 흐물거려서 쓰러지지 않아요");
	}
}
