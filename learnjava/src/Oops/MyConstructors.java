package Oops;

public class MyConstructors {
	MyConstructors(){
		System.out.println("hi i am constructor");
	}
public static void main(String[] args) {
	MyConstructors obj=new MyConstructors();
	vehicle car=new vehicle(4);
	vehicle car2=new vehicle(4,"black");
	vehicle car3=new vehicle();
	System.out.println(car3.wheels+" "+car3.headlight);
	System.out.println(car2.color+" "+car.headlight+" "+car2.wheels);
}
}
class vehicle{
	int wheels;
	int headlight;
	String color;
	vehicle(int wheels){
		this.wheels=wheels;
		headlight=2;
	}
	vehicle(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
		headlight=2;
	}
	vehicle(){
		
	}
}