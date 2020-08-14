package Abstraction;

public class RepairShop {
 
	public static void repair(car car) {
		System.out.println("car is repaired");
	}
	
	public static void main(String[] args) {
		wegonr wegonr=new wegonr();
		audi audi=new audi();
		repair(wegonr);
		repair(audi);
	}
}
