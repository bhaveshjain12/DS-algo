package Fullstack;

import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		
	
//	         int arr[]={4,12,7,15,9};
//	         int start = 0;
//	         int end = 0;
//	         int temp=0;
//	         int start =1;
//	         int end =4;
//	         for(int i=0;i<arr.length;i++){
//	            if(start>=end){
//	                return;
//	                int temp =arr[start];
//	                arr[start]=arr[end];
//	                arr[end]=temp;
//	        
//	            }  
//	                    System.out.println(arr[i]+" ");
//	                    System.out.println("");
//	                }
//	            
//	        
//	         for(int i=0;i<5;i++) {
//	        	 for(int j=0;j<i;j++) {
//	        		 int temp=arr[i];
//	        		 arr[i]=arr[j];
//	        		 arr[j]=temp;
//	        		 System.out.print(arr[i]+ " ");
//	        	 }
//	        	 System.out.println(i);
//	         }
//	        
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of an arry ");
//		int n=sc.nextInt();
		//int arr[]= {4,12,7,15,9};
		//System.out.println("enter the value of an arry");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		//***************************************************************
//		int temp;
//		int start=0;
//		int end=arr.length-1;
//		//1 2 3 4 5
//		while(start<end) {
//			temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
//		System.out.println("after rever anser is");
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[j] + " ");
//		}
		   Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int arr []=new int[N];
	        for(int i=0;i<N;i++){
	            arr[i]=sc.nextInt();
	        }
	        for(int i=N-1;i>=0;i--){
	            System.out.print(arr[i]);
	        }
	    }
	

}
