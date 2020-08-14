package OopsInharitance;

public class Singer extends Person{
 
	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sing() {
		System.out.println("Singer is singing");
	}
	public void eat() {
		System.out.println("Singer "+name+"  is eating");
	}
	public static void Laughing( ) {
		// TODO Auto-generated method stub
		System.out.println("Singer is laguhing ");
	}

}
