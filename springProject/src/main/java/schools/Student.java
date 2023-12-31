package schools;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import inter.Quick;

public class Student implements Quick<Student> {
	String name;
	Map<String, Integer> subjects;
	int sum, classesRank, sumRank;
	double avg;
	
	public Student() {};
	
	public Student(String name, Map<String, Integer> subjects) {
		this.name = name;
		this.subjects = subjects;
		calc();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getClassesRank() {
		return classesRank;
	}
	public void setClassesRank(int classesRank) {
		this.classesRank = classesRank;
	}
	public int getSumRank() {
		return sumRank;
	}
	public void setSumRank(int sumRank) {
		this.sumRank = sumRank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	void calc() {
		Iterator<Entry<String, Integer>> values = subjects.entrySet().iterator();
		while(values.hasNext()) {
			Entry<String, Integer> val = values.next();
			int score = val.getValue();
			sum += score;
		}
		avg = (double)sum / subjects.size();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subjects=" + subjects + ", sum=" + sum + ", classesRank=" + classesRank + ", sumRank="
				+ sumRank + ", avg=" + avg + "]\n";
	}
//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(sum, o.sum);
//	}
	@Override
	public int compare(Student o1, Student o2) {
		return (o1.sum - o2.sum)*-1;
	}
}
