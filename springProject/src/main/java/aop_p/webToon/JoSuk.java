package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class JoSuk {
	public String dog1(int aa, String bb) {
		System.out.println("센세이션 " + aa + bb);
		return "센세이션";
	}
	
	public String wife() {
		System.out.println("애봉파워");
		return "애봉";
	}
	
	public int papa(int cc) {
		System.out.println("초절왕"+cc);
		return 4000;
	}
}
