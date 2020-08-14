package Abstraction;

public abstract class car {

	public abstract void accelerate() ;
	public abstract void breaking() ;  
	public void honk() {
		System.out.println("car is honking");   // also called concread method 
	}
}
// abstract method is class abstract honi chiya
// abstract methoh ko uske child define krne chiya 
// abstract class main non abstract method bna shte hai
// abstract class ka obj nhi bn skta