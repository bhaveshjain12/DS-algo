package assingment;

import java.util.Scanner;

public class ques5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if( i!=n  ||  j==n || j!=3 || i!=2 ) {
			System.out.print("* ");
		}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}