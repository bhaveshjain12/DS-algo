package whileloop;

import java.util.Scanner;

public class sumofdigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	while(temp>0) {
		int ld=temp % 10;
		temp /=10;
		sum +=ld;
	}
	System.out.println(n+" ="+ sum);
}
}
