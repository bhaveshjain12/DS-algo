package Execptionalhandling;

public class Execption1 {
public static void main(String[] args) {
	try {
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage() +" occured ,please check");
	}catch(IndexOutOfBoundsException e) {
		System.out.println("check the array");
	}finally {
		System.out.println("sorry for the inconvenience");
	}
	System.out.println("very imp code ");
	System.out.println("need to run");
	boolean isdanger =true;
	if(isdanger) {
		throw new ArrayIndexOutOfBoundsException("Danger is comming");
	}
	//fun1();
}
//	static void fun1() {
//		int a=5;
//		int b=3;
//		int c=a/b;
//		System.out.println(c);
//		try {
//		fun2();
//		}catch(Exception e){
//			System.out.println(e.getMessage() +" occured");
//		}
//}
//static void fun2() throws ArrayIndexOutOfBoundsException {
//	boolean isdanger =true;
//	if(isdanger) {
//		throw new ArrayIndexOutOfBoundsException("Danger is comming");
//	}
}
//}