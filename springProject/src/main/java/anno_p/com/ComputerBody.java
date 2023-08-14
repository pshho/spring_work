package anno_p.com;

import org.springframework.stereotype.Component;

@Component("bbcc") // 이름을 명시하면 아까 Main에서 못불러오던 것을 불러올 수 있음
public class ComputerBody {
	String name = "삼보트라이젠", cpu="1.33Ghz";

	public void setName(String name) {
		this.name = name;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "ComputerBody [name=" + name + ", cpu=" + cpu + "]";
	}
}
