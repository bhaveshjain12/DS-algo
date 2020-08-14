package Encapsulation;

public class Student {

	private int age;
	private String name;
	private String cast;
	private int mobileno;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.println("ypu are too olde to be a student");
		}else {
		this.age=age;
	}
	}
		public String getName() {
			return name;
		}
	public void setName(String name) {
		this.name=name;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	
}
