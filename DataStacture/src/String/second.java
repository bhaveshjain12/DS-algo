package String;

import java.util.*;

public class second {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int sum=0;
	    for(int i=0;i<=n;i++){
	      sum=sum+i;
	      
	    }
	    System.out.println(sum);
	}
	System.out.println();
}
}