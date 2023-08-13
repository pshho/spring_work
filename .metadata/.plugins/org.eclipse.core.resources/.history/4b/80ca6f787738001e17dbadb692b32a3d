package test;

import java.util.Random;

public class Recursive {

	public static void main(String[] args) {
		int[] d = {1,2,3,4,5,6};
		int a = d[new Random().nextInt(6)];
		int b = d[new Random().nextInt(6)];
		int c = d[new Random().nextInt(6)];

		int result = (a!=b && a!=c && b!=c) ? a+b+c : (((a==b && a!=c) || (a==c && a != b) ||  (b==c && a != b)) ? (a+b+c)*(a*a+b*b+c*c) : (a==b && b==c) ? (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c) : 0);
		System.out.println(a + " " + b + " " + c);
		System.out.println(result);
	}
	
	static class Person{
		String name;
		
		public Person(String name, int quick) {
			super();
			this.name = name;
		}
		
		public int invasion(int level) {
			int lev = 1;
			return lev + level;
		}
		
		public int quick() {
			return -1;
		}
		
		
	}

}
