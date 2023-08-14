package anno_p;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

// 다른 패키지의 클래스들까지 component로 가져올 수 있음
@ComponentScan(basePackages = "anno_p.com")
// 다른 xml파일을 가져오는 작업
@ImportResource("anno_xml/autowired.xml")
public class AnnoConfig {
	@Bean
	BiHandle hd1() {
		return new BiHandle("일자핸들", "산악용");
	}
	
	@Bean
	BiHandle hd2() {
		return new BiHandle("3자핸들", "오인용");
	}
	
	@Bean
	BiWheel wh1() {
		return new BiWheel("디스크", 28);
	}
	
	@Bean
	BiWheel wh2() {
		return new BiWheel("카본", 27);
	}
	
	@Bean
	Bicycle mtb(BiHandle hd1, BiWheel wh1) {
		return new Bicycle("삼천리", hd1, wh1);
	}
	
	@Bean
	Bicycle pb(BiHandle hd2, BiWheel wh2) {
		return new Bicycle("화려강산", hd2, wh2);
	}
}
