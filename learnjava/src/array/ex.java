package array;

import java.util.*;

public class ex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    for(int i=a-1;i>=0;i--){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();

}
}