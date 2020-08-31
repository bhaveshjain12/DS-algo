package Arrays;

public class question1 {
	void leftrotate(int arr[],int d,int n) {
		for(int i=0;i<d;i++) {
			leftrotatebyone( arr, n);
		}
		
	}
	void leftrotatebyone(int arr[],int n) {
		int i,temp;
		temp=arr[0];
		for(i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
	}
	void printarray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		question1 q=new question1();
		int arr[]= {1,2,3,4,5,6,7};
		q.leftrotate(arr, 2, 7);
		q.printarray(arr, 7);
	
}
}
