package di_p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DIColl {
	String nick;
	int age;
	
	int[] arr, arr1;
	
	List arr2;
	
	Set set1;
	
	Map map1;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr1() {
		return arr1;
	}

	public void setArr1(int[] arr1) {
		this.arr1 = arr1;
	}

	public List getArr2() {
		return arr2;
	}

	public void setArr2(List arr2) {
		this.arr2 = arr2;
	}

	public Set getSet1() {
		return set1;
	}

	public void setSet1(Set set1) {
		this.set1 = set1;
	}

	public Map getMap1() {
		return map1;
	}

	public void setMap1(Map map1) {
		this.map1 = map1;
	}
	@Override
	public String toString() {
		return "DIColl [nick=" + nick + ", age=" + age + ", arr=" + Arrays.toString(arr) + ", arr1="
				+ Arrays.toString(arr1) + ", arr2=" + arr2 + ", set1=" + set1 + ", map1=" + map1 + "]";
	}
}
