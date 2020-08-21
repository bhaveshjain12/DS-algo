package Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class question1Duplicatearray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println(duplicate(a));

		
		System.out.println(finduplicate(a));
	}
}


//********function approch*****



static int duplicate(int a[]) {
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		if(a[i]==a[i+1]) {
			return a[i];
		}
	}
	return -1;
}


//**********hashset approch************
public static int finduplicate(int [] a) {
	HashSet<Integer> set=new HashSet<>();
	for(int i:a) {
		if(set.contains(i)) {
			return i;
		}else {
			set.add(i);
		}
	}
	
	return -1;
}
}
