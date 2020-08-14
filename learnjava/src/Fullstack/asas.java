package Fullstack;

import java.util.Scanner;

public class asas {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rem=0,sum=0,a=0;
	n=n*n;
	while(n!=1) {
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem);
			n=
					
					
					n/10;
		}
		n=sum;
		if(n<10 && n!=1) {
			a=1;
			break;
		}
		sum=0;
	}
	if(a==1)
		System.out.println("unhappy number");
	else
		System.out.println("happy number");
}
}
