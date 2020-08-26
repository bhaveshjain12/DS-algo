package Day1;
import java.util.*;
import java.lang.*;
import java.io.*;



	/*package whatever //do not write package name here */

	
	

		//code
		/*package whatever //do not write package name here */

		import java.util.*;
		import java.lang.*;
		import java.io.*;

		public class test {
			public static void main (String[] args) {
				//code
				Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				
				while(t-->0){
				    boolean flag=true;
				    int n=sc.nextInt();
				    int a[]=new int[n];
				    for(int i=0;i<n;i++){
				        a[i]=sc.nextInt();
				    }
//				    int b[]=new int[n];
//				     for(int j=0;j<n;j++){
//				        b[j]=a[j];
//				    }
//				    
//				    
//				    Arrays.sort(a);
//				     for(int i=0;i<n;i++){
//				        if(a[i]!=b[i]){
//				            flag=false;
//				            break;
//				        }
//				        break;
//				    }
				    for(int i=0;i<a.length;i++) {
				    	if(a[i]<=a[i+1]) {
				    		
				    	}
				    }
				    
				if(flag)
				    System.out.println(1);

				else
				        System.out.println(0);
				  
				  
				}
				System.out.println();
			}
		}