package studentAop;

import java.util.Map;

public class Student {
	String category, name;
	Map<String, Integer> subjects;
	int sum;
	float avg;
	
	public Student() {
		super();
	}

	public Student(String name, Map<String, Integer> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
		calc(subjects);
		
		String[] arr = "뭐라고하는반,일반,예체능".split(",");
		if(subjects.size()==2) {
			category = arr[subjects.size()%2];
		}else {
			category = arr[subjects.size()/2];
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}
	
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	
	void calc(Map<String, Integer> subjects) {
		for(Map.Entry<String, Integer> sub : subjects.entrySet()) {
			sum += sub.getValue();
		}
		avg = sum / subjects.size();
	}

	@Override
	public String toString() {
		return "Students [category=" + category + ", name=" + name + ", subjects=" + subjects + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
}
