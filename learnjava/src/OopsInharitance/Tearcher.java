package OopsInharitance;

public class Tearcher extends Person {
	public Tearcher(String name) {
		super(name);
		System.out.println("inside the teacher constructor");
	}
	public void teach() {
		System.out.println(name+" is teaching");
	}
	public void eat() {
		super.eat();
		System.out.println("teacher "+name+" is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Laughing( ) {
		// TODO Auto-generated method stub
		System.out.println("teacher is laguhing ");
	}

}