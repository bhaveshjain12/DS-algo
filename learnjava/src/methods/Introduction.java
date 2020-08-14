package methods;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fn=23;
		int sn=33;
		int result=maxOf(fn,sn);
		System.out.println(result);
		maxOf(5);
	}
 static int maxOf(int a,int b) {
	 if(a>b){
		 return a;
	 }else {
		 return b;
	 }
 }
	 static int maxOf(float c) {
		 return 0;
	 }
 
}
