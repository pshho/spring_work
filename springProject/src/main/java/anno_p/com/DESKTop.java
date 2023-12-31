package anno_p.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import anno_p.com.sub1.Mouse;
import anno_p.comabc.Monitor;
import jakarta.annotation.Resource;

@Component
public class DESKTop {
	String name = "오마이피씨";
	@Resource
	Mouse mouse;
	@Autowired
	@Qualifier("mnntt")
	Monitor mon;
	@Autowired
	ComputerBody bc;
	
	@Override
	public String toString() {
		return "DESKTop [name=" + name + ", mouse=" + mouse + ", monitor=" + mon + ", bc=" + bc + "]";
	}
}
