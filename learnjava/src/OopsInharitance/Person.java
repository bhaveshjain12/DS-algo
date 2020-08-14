package OopsInharitance;

public class Person {
	public Person(String name) {
		this.name=name;
		System.out.println("inside the Person constructor");
	}
	
	protected String name;
	 
	public void walk(){
		System.out.println("person "+ name +" is walking");
	}
	public void eat() {
		System.out.println("person "+name+" is eating");
	}

	public static void Laughing( ) {
		// TODO Auto-generated method stub
		System.out.println("person is laguhing ");
	}

}
