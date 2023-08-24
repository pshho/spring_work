package aaa.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class SeasonMain {
	String[] data;
	
	public SeasonMain(String[] data) {
		this.data = data;
		
//		data.put("spring", "sp1.jpg,sp2.jpg,sp3.jpg".split(","));
//		data.put("summer", "suma.png,sumb.png".split(","));
//		data.put("fall", "at_1.jpg,at_2.jpg,at_5.jpg,at_6.jpg".split(","));
//		data.put("winter", "ww.jpg,ee.jpg,wn.jpg".split(","));
	}
}
