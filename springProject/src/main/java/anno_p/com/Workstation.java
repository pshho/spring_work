package anno_p.com;

import anno_p.com.sub1.Mouse;
import anno_p.comabc.Monitor;

public class Workstation {
	String name;
	
	ComputerBody cmb;
	
	Monitor mon1, mon2;
	
	Mouse mm;

	public Workstation() {
		
	}
	
	public Workstation(String name, ComputerBody cmb, Monitor mon1, Monitor mon2, Mouse mm) {
		super();
		this.name = name;
		this.cmb = cmb;
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mm = mm;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCmb(ComputerBody cmb) {
		this.cmb = cmb;
	}

	public void setMon1(Monitor mon1) {
		this.mon1 = mon1;
	}

	public void setMon2(Monitor mon2) {
		this.mon2 = mon2;
	}

	public void setMm(Mouse mm) {
		this.mm = mm;
	}

	@Override
	public String toString() {
		return "Workstation [name=" + name + ", cmb=" + cmb + ", mon1=" + mon1 + ", mon2=" + mon2 + ", mm=" + mm + "]";
	}
}
