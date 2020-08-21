package Day1;
import java.util.*;
import java.lang.*;
import java.io.*;

public class test {

	/*package whatever //do not write package name here */

	
	public static void main(String[] args) {

			//code
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		Number(a);
	}
	
	static void Number(int a[])
	{
		int arr[] = new int[a.length+1];
		
		for(int i=0;i<a.length;i++)
		{
			arr[a[i]]++;
		}
		
		for(int i=1;i<arr.length;i++)
		{
			
			
			
			
			if(arr[i] >= 2)
			{
				System.out.println();
				System.out.print("Duplicate Number = "+i);
			}
			System.out.println();
			 if(arr[i] == 0)
			{
				System.out.print("Missing Number = "+i);
			}
		}
	}
}











