package anno_p.comabc;

import org.springframework.stereotype.Component;

@Component
public class Monitor {
	String name = "삼성 모니터";
	int size = 22;
	
	@Override
	public String toString() {
		return "Monitor [name=" + name + ", size=" + size + "]";
	}
}
