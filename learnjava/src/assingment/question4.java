package assingment;

import java.util.Scanner;

public class question4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=2*n-1;
	for(int i=1;i<=r;i++) {
		if(i<=n) {
			for(int k=1;k<=r-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			
		}
		else {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=r-i+1;j++ ) {
				System.out.print("*");
			}
			
		}
		System.out.println();
	}
}
}
