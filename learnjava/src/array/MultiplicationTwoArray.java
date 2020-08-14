package array;

import java.util.Scanner;

public class MultiplicationTwoArray {
public static void main(String[] args) {
	System.out.println("enter the dimenstion:");
	Scanner sc=new Scanner(System.in);
	
	int row=sc.nextInt();
	int cols=sc.nextInt();
	int a [][]=new int[row][cols];
	int b [][]=new int[cols][row];
	System.out.println("enter a:");
for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		a[i][j]=sc.nextInt();
	}
}
System.out.println("enter b:");
for(int i=0;i<cols;i++) {
	for(int j=0;j<row;j++) {
		b[i][j]=sc.nextInt();
	}
}
	int c [][]=new int[row][cols];
	for(int i=0;i<row;i++) {
		for(int j=0;j<cols;j++) {
			c[i][j]=a[i][j]*b[j][i];
		}
	}
	System.out.println("get c:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
}
}
