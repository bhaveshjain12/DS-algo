package String;

import java.util.Scanner;

public class StringIntro {
public static void main(String[] args) {
	String name="Bhavesh jain ";//by latteral store in pool memory
//	String name2="Bhavesh ";
//	
//	String anothername=new String("Bhavesh");//by object sort in both pool and heap memory
//	System.out.println(name==name2);
//	System.out.println(name.charAt(7));//.charAt(0)
//	System.out.println(name.length());//.length()
	System.out.println(name.substring(0));//.substring(int beginIndex)
	System.out.println(name.substring(8, 13));//.substring(int beginIndex,endIndex)
	System.out.println(name.contains(" "));//.contains(" ")
////	String name2=new String("Bhavesh jain ");
////	System.out.println(name.equals(name2));//.equls(name2) find value is equal or not
//	String a="";
//	System.out.println(a.isEmpty());
//	System.out.println(name.concat("jain"));
//	System.out.println(name.replace('h','a'));
	String cars="hyundi,bmw,farrai,audi,swift,wagnor,aulto800";
	String allcars[]=cars.split(",");
for( String car:allcars) {
	System.out.print(car+" ");
////	
////}
//System.out.println(cars.indexOf('b'));
//System.out.println(cars.toLowerCase());
//System.out.println(cars.toUpperCase());
//	Scanner sc=new Scanner(System.in);
//	String s=sc.nextLine();
//	String a=s;
//	System.out.println(a);
}
}
}
