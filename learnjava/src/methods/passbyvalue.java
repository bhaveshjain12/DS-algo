package methods;

public class passbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int c=2;
//     int d=4;
//     swap(c,d);
//     System.out.println(c+ " " + d);
//		Dog c=new Dog();
//		c.leg=4;
//		System.out.println(c.leg);
//		Dog d=new Dog();
//		d.leg=6;
//		System.out.println(d.leg);
//		swap(c.leg,d.leg);
//		System.out.println(c.leg+ " "+d.leg);
        Dog a=new Dog();
        a.leg=2;
        changeDog(a);
        System.out.println(a.leg);
	}
 static void swap(int a,int b) {
	 int temp=a;
	 a=b;
	 b=temp;
	 System.out.println(a+"ab "+ b);
 }
 static void changeDog(Dog dog) {
	 dog.leg=8;
 }
 static void swap(Dog a,Dog  b) {
	 Dog temp =a;
	 a=b;
	 b=temp;
			 
 }

}
class Dog{
	int leg;
}