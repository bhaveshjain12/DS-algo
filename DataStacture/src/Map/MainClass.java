package Map;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
public static void main(String[] args) {
	

//	Map<String, Integer> num=new HashMap<>();
//	num.put("one", 1);
//	num.put("Two", 2);
//	num.put("five", 5);
//	
//	System.out.println(num.keySet());
//	System.out.println(num.entrySet());
//	
//	Set<Entry<String ,Integer>> entries=num.entrySet();
//	
//	for(Entry<String ,Integer> entry: num.entrySet()) {
//		entry.setValue(entry.getValue()*100);
//		
//	}
//	System.out.println(num);
	System.out.println(getHash("CAT"));
	System.out.println(getHash("DOG"));
	System.out.println(getHash("BALL"));
	System.out.println(getHash("GOD"));
}
public static int  getHash(String s) {
	int hash=0;
	for(int i=0;i<s.length();i++) {
		hash +=s.charAt(i);
	}
	return hash;
}
}