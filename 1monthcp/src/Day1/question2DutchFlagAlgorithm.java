package Day1;

import java.util.*;

public class question2DutchFlagAlgorithm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			//System.out.print(a[i] +" ");
		}
		sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
}
	
}
static void sort(int []nums) {
	int low=0;
	int high=nums.length-1;
	int mid=0;
	int temp ;
	while(mid<=high) {
		switch(nums[mid]) {
		case 0:{
			temp=nums[low];
			nums[low]=nums[mid];
			nums[mid]=temp;
			low++;
			mid++;
			break;
		}
		case 1:
			mid++;
			break;
		case 2:{
			temp=nums[high];
			nums[high]=nums[mid];
			nums[mid]=temp;
			high--;
			break;
		}
		}
		
	}
	
}
}