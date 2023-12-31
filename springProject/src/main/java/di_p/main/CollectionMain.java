package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.DIColl;

public class CollectionMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/collection.xml");
		
		ArrayList arr1 = context.getBean("arr1", ArrayList.class);
		HashSet set1 = context.getBean("set1", HashSet.class);
		LinkedHashSet liSet1 = context.getBean("liSet1", LinkedHashSet.class);
		HashMap map1 = context.getBean("map1", HashMap.class);
		DIColl dic = context.getBean("dic", DIColl.class);
		System.out.println(arr1);
		System.out.println(set1);
		System.out.println(liSet1);
		System.out.println(map1);
		System.out.println(dic.getNick() + ", " + dic.getAge());
		System.out.println(Arrays.toString(dic.getArr()));
		System.out.println(Arrays.toString(dic.getArr1()));
		System.out.println(dic.getArr2());
		System.out.println(dic.getSet1());
		System.out.println(dic.getMap1());
	}

}
