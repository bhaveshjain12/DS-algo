package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Dog d=new Dog();
		Pet p=d;		
		
		
		System.out.println(d.name);
		System.out.println(p.name);		///****************methot overwrite hota hai variable nhi
		
		
		
		//runtime polymorphism
		Animal a=d;
		d.walk();
		p.walk();
		greetings();
		greetings("mr.bhavesh",5);//compiletime polymorphism
	}
	public static void greetings() {
		System.out.print("hi.there is greeting for you ");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s,int count) {
		for(int i=0;i<count;i++) {
		System.out.println(s+" "+i);
	}
	}
}
