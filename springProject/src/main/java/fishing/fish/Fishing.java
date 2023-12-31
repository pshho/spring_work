package fishing.fish;

import org.springframework.stereotype.Component;

@Component
public class Fishing {
	public void seaFish() {
		System.out.println("오늘은 물고기를 잡으러 가는 날~");
		System.out.println("아이 기대되네~ 뭐가 잡힐까~");
	}
	
	public String seaFishing(int bait) {
		int fishSize = bait * 5;
		String fish = "물고기";
		
		if(fishSize > 40) {
			fish = "돔";
		}else if(fishSize > 30) {
			fish = "방어";
		}
		
		return fishSize + " 사이즈의 " + fish;
	}
}
