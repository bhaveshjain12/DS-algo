package array;

import java.util.Scanner;

public class avragemarks {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of student");
	int n=sc.nextInt();
	int marks[]=new int[n];
	for(int i=0;i<n;i++) {
		marks[i]=sc.nextInt();
		System.out.print(marks[i]+" ");
	}
	int avg=0;
	for(int i=0;i<n;i++) {
		avg=avg+marks[i];
		System.out.println(avg);
	}
	avg /=n;
			System.out.println("avg"+ avg);
	
}
}
