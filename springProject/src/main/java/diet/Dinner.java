package diet;

public class Dinner {
	String rice, mainDish1, mainDish2, sideDish1, sideDish2, soup, dessert;
	
	public Dinner(String rice, String mainDish1, String mainDish2, String sideDish1, String sideDish2, String soup,
			String dessert) {
		super();
		this.rice = rice;
		this.mainDish1 = mainDish1;
		this.mainDish2 = mainDish2;
		this.sideDish1 = sideDish1;
		this.sideDish2 = sideDish2;
		this.soup = soup;
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return "오늘의 저녁은 호화롭게 먹어야 할 것 같아요\n요즘 항상 고기만 먹었으니 오늘은 다양하게 먹어볼까요?\n오늘의 저녁 식단은 "
				+ "[rice=" + rice + ", mainDish1=" + mainDish1 + ", mainDish2=" + mainDish2 + ", sideDish1="
				+ sideDish1 + ", sideDish2=" + sideDish2 + ", soup=" + soup + ", dessert=" + dessert + "]";
	}
	
}
