package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits =new ArrayList();
		List<String> vegitables =new LinkedList();
		fruits.add("apple");
		fruits.add("hi");
		fruits.add("orange");
		
		
		vegitables.add("carrat");
		vegitables.add("tamato")
		;vegitables.add("patato");
		
		
		
		fruits.addAll(vegitables);
		
		
		System.out.println(fruits.set(2,"papaya"));
		
		
//		List<String> toremove =new ArrayList();
//		toremove.add("apple");
//		toremove.add("orange");
//		fruits.removeAll(toremove);
		//fruits.clear();
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.contains("apple"));
		System.out.println(fruits.isEmpty());
		
		
		
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp);
		for(String e:fruits) 
		System.out.println(e);
		
		
		
		
		
		
		
		
		
		
		//fruits.add(23);
		//fruits.add(12.4);
		//System.out.println(fruits.get(2));
	//************************************************genaric class example	
//		Pair<String,Integer> p1=new Pair("bhavesh",8);
//		Pair<Boolean,String> p2=new Pair(true,"bhavesh");
//		p1.getDescription();
//		p2.getDescription();
		
//		List<String> toremove =new ArrayList();
//		toremove.add("apple");
//		toremove.add("orange");
	}

}
