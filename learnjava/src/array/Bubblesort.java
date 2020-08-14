package array;

import java.util.Scanner;

public class Bubblesort {
public static void main(String[] args) {
	
	int a[]= {1 ,5,7,89,9};
	int n=a.length;
	for(int i=0;i<n-1;i++) {
		boolean sorting=true;
		for(int j=0;j<n-1-i;j++) {
			if(a[j+1]<a[j]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				sorting	=false;
			}
	}
		if(sorting)
			
			break;
			
		
}
	for(int item:a) {
		System.out.print(item+" ");
	}
}
}