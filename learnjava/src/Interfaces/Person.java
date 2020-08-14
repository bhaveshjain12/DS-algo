package Interfaces;

public class Person implements Student,Youtube {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.make_video();
		Youtube obj2=obj;
		obj2.editvideo();
		obj2.make_video();
		obj2.uploardvideo();
	}

	@Override
	public
	void study() {
		System.out.println("person is studying");
		
	}

	@Override
	public void make_video() {
		System.out.println("person is making video");
		
	}

	@Override
	public void editvideo() {
		System.out.println("edit video");
		
	}

}
