package Fullstack;

import java.util.Arrays;

public class GreaterDigitForSameDigit {
	static void change(char arr[],int i,int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println();
	}
	static void find(char arr[],int n) {
		int i;
		for( i=n-1;i>0;i--) {
			if (arr[i]>arr[i-1]) {
				break;
			}
		}
		if(i==0)
		{
			System.out.println("Not possible");
		}
		else
		{
			int a=arr[i-1],min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>a && arr[j]<arr[min]) {
					min=j;
				}
			}
			change(arr,i-1,min);
			Arrays.sort(arr,i,n);
			System.out.println("next number greater number ");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char digits[]= {'1','5','4','8','3'};
		System.out.println("number"+ " = " + "15483");
				int n= digits.length;
				find(digits, n);
		}

	}

