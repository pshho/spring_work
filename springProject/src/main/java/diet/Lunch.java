package diet;

public class Lunch {
	String rice, mainDish, sideDish, soup;

	public Lunch(String rice, String mainDish, String sideDish, String soup) {
		super();
		this.rice = rice;
		this.mainDish = mainDish;
		this.sideDish = sideDish;
		this.soup = soup;
	}

	@Override
	public String toString() {
		return "오늘은 강남에서 점심을 먹어요\n근데 태풍이 오네요 어떻게 해야 할까요?\n그래서 오늘의 점심 식단은 "
				+ "[rice=" + rice + ", sideDish=" + sideDish + ", mainDish=" + mainDish + ", soup=" + soup + "]";
	}
}
