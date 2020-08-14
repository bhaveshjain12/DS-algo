package array;

import java.util.Scanner;

public class TwoArrayAssingment {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int cols=sc.nextInt();
	System.out.println("Enter dimention:");
	int a[][]=new int[row][cols];
	int b[][]=new int[row][cols];
	System.out.println("enter a:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<cols;j++) {
			 a[i][j]=sc.nextInt();
			 
		}
	}
	System.out.println("enter b:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				 b[i][j]=sc.nextInt();
			}
	}
		int c[][]=new int[row][cols];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				 c[i][j]=a[i][j] + b[i][j];
			}
}
		System.out.println("this is your c:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				 System.out.print(c[i][j] +" ");
			}
			System.out.println();
}
		
}
}
