package diet;

public class Breakfast {
	String toast, fruit, cereal;
	
	public Breakfast(String toast, String cereal, String fruit) {
		super();
		this.toast = toast;
		this.cereal = cereal;
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "아침마다 힘든 그대를 위해 오늘의 아침을 준비했어요\n오늘의 아침 식단은 "
				+ "[toast=" + toast + ", fruit=" + fruit + ", cereal=" + cereal + "]";
	}
}
