package Arrays;

public class question2byreversalalgorithm {
	static void leftrotate(int arr[],int d,int n) {
		if(d==0) {
			return;
		}
		d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
		leftrotate(arr,d,n);
		print(arr,n);
		
	}
}
