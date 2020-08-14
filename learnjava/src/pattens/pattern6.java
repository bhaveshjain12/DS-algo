package pattens;

import java.util.Scanner;

public class pattern6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("*");
	
	for(int i=2;i<=n-1;i++) {
		System.out.print("* ");
		
		for(int j=0;j<=i-2;j++){
			System.out.print("  ");
		}
		System.out.println("* ");
		
	}
	
	for(int i=1;i<=n;i++) {
		System.out.print("* ");
	}
	
}
}
