package Set;

import java.util.HashSet;
import java.util.*;

public class mainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits=new TreeSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("apple");
//		fruits.add("Kiwi");
//		System.out.println(fruits);
		Set<Integer> x=new HashSet<>();
		x.add(32);
		x.add(16);
		x.add(6);
		
		Set<Integer> y =new HashSet<>();
		y.add(13);
		y.add(16);
		y.add(36);
		
		//x.addAll(y);
		x.retainAll(y);
		System.out.println(x);
	}
}
