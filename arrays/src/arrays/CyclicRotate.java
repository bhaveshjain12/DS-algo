package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotate {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	while(n-->0){
	    int t=sc.nextInt();
	    int a[]=new int[t];
	    for(int i=0;i<t;i++){
	        a[i]=sc.nextInt();
	        }
	        int x=a[a.length-1],i;
	   for(i=a.length-1;i>=1;i--){
	       a[i]=a[i-1];
	   } 
	   		a[0]=x;
	   		String str=Arrays.toString(a);
	   		int d = 0;
	       for(int j=0;j<Integer.parseInt(str);j++) {
	    	   d=j;
	       }
	       System.out.println(d+" ");
}
}
}

