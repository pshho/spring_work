package studentsGrade;

import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements BeanNameAware, InitializingBean, DisposableBean {
	String name, grade;
	int sum, avg;
	int[] score;
	
	public Student() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
		calc(score);
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAvg() {
		return avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", sum=" + sum + ", avg=" + avg + ", score="
				+ Arrays.toString(score) + "]";
	}
	public void calc(int[] score) {
		for(int sc : score) {
			sum += sc;
		}
		
		avg = sum/score.length;
	}
	@Override
	public void destroy() throws Exception {
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	}
	@Override
	public void setBeanName(String name) {
//		if(name.matches("red(.*)")) {
//			char grades = "가가가가가가양미우수수".charAt(avg/10);
//			grade = grades + "";
//		}else if(name.matches("yellow(.*)")) {
//			char grades = "99876543211".charAt(avg/10);
//			grade = grades + "";
//		}else if(name.matches("blue(.*)")) {
//			char grades = "FFFFFFDCBAA".charAt(avg/10);
//			grade = grades + "";
//		}
	}
}
