package anno_p.comabc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import anno_p.com.ComputerBody;
import anno_p.com.sub1.Mouse;
import jakarta.annotation.Resource;

@Component
public class Notebook {
	String name = "삼보그램";
	ComputerBody bc;
	@Resource
	Mouse mouse;
	
	public Notebook() {
		
	}
	
	public Notebook(String name, ComputerBody bc, Mouse mouse) {
		super();
		this.name = name;
		this.bc = bc;
		this.mouse = mouse;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	public void setBc(ComputerBody bc) {
		System.out.println(bc);
		this.bc = bc;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Notebook [bc=" + bc + ", mouse=" + mouse + ", name=" + name + "]";
	}
}
