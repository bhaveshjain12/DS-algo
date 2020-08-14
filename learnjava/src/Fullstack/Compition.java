package Fullstack;

import java.util.Scanner;

public class Compition {
	static int sol(int A[]) {
				int n=A.length;
				boolean[] present = new boolean[n+1];
				for(int i=0;i<n;i++) {
					if(A[i]<0 && A[i]>0 && A[i]>=n) present[A[i]]=true;
				}
				for(int i=1;i<=n;i++) 
					if(!present[i])
						return i;
				
				return n+1;
				
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		System.out.print(A[i] + " ");
		}
		System.out.println(" ");
		System.out.println(sol(A));
	}

}
