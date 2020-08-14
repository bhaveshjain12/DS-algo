package whileloop;

import java.util.Scanner;

public class palindromenumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rev=0;
	int rem;
	while(temp>0) {
//		int ld=temp%10;
//		rvs= rvs *10+ld;
//		temp /=10;
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	if(rev==n) {
		System.out.println(n+ " is a palindrom");
	}else {
		System.out.println(n + "is not");
	}
}
}
