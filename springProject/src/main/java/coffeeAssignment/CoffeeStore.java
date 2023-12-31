package coffeeAssignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeStore implements CoffeeInterface {
	String order;
	@Autowired
	List<Object> coffees;

	public void setOrder(String order) {
		this.order = order;
	}

	public List<Object> getCoffees() {
		return coffees;
	}

	@Override
	public String toString() {
		return "CoffeeStore [order=" + order + ", coffees=" + coffees + "]";
	}

	@Override
	public void make() {
		System.out.println("이 커피는 " + "원두를 씁니다.");
		System.out.println("그리고 물 " + "과 에스프레소 " + "가 들어갑니다.");
	}

	@Override
	public void sell() {
		System.out.println("주문하신 커피 나왔습니다.\n 이 커피는 " + "원 입니다.");
	}

	@Override
	public void event() {
		System.out.println("축하드립니다. 이벤트에 당첨되셔서 " + "을 무료로 드립니다.");
	}

	@Override
	public void orders() {
		System.out.println(" 주문 받았습니다.");
	}
}
