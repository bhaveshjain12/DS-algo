package Day1;


	/*package whatever //do not write package name here */

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class question3duplicateandmissing {
		public static void main (String[] args) {
			//code
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0){
			    int n=sc.nextInt();
			    int a[]=new int[n];
			    for(int i=0;i<a.length;i++){
			        a[i]=sc.nextInt();
			    }
			    System.out.println(find(a));
			    find2(a);
			}
		}
		static int find(int arr[]) {
			Arrays.sort(arr);
		    for(int i=0;i<arr.length;i++){
	        if(arr[i]==arr[i+1]) {
		        return arr[i];
		        }
		    }
			return -1;
		}
		    
	//	    int arr[]=new int[a.length+1];
//		    for(int i=0;i<a.length;i++){
//		        arr[a[i]]++;
//		    }
//		    for(int i=0;i<arr.length;i++){
//		        if(arr[i]==0){
//		            System.out.println(i);
//		        }
//		    }
		
		//*********************MATH.aBS******************
//		static void find(int arr[]){
//			int size=arr.length;
//			for (int i = 0; i < size; i++) { 
//	            int abs_val = Math.abs(arr[i]); 
//	            if (arr[abs_val - 1] > 0) 
//	                arr[abs_val - 1] = -arr[abs_val - 1]; 
//	            else
//	                System.out.println(abs_val); 
//	        } 
		    
		    static void find2(int arr[]) {
		    	for (int i = 0; i < arr.length; i++) { 
		            if (arr[i] > 0) 
		                System.out.println(i + 1); 
		        } 
		    } 
		}
		

