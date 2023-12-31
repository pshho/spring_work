package di_p;

public abstract class CoffeeShop {
	public Coffee order_am() {
		System.out.println("order_am() 실행");
		return new Coffee("아메리카노", 1400);
	}
	
	public Tea order_tea() {
		System.out.println("order_tea() 실행");
		return new Tea("생각대로", 2400);
	}
	
	private Coffee order_private() {
		System.out.println("order_private() 실행");
		return new Coffee("아프리카노", 1900);
	}
	
	public Coffee order_private2() {
		System.out.println("order_private2() 실행");
		return order_private();
	}
	
	public final Coffee order_final() {
		System.out.println("order_final() 실행");
		return new Coffee("와그라노", 6800);
	}
	
	public static Coffee order_static() {
		System.out.println("order_staitc() 실행");
		return new Coffee("와이라노", 7800);
	}
	
	public Coffee order_piano() {
		System.out.println("order_piano() 실행");
		return new Coffee("피아노", 3895800);
	}
	
	abstract public Coffee order_hunter();
	
	abstract public Coffee order_latte();
	
	public void order_void() {
		// <lookup-method name="order_void" bean="cof2" />
		// 실행 안됨
		System.out.println("order_void() 실행");
	}
}