 package whileloop;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		do {
			 n=sc.nextInt();
			System.out.println(n);
		}while(n!=0);
	}
}
