package arrays;

public class brootforceapproch {
	
//	void r(int arr[],int k) {
//		int j=0;
//		while(k>0) {
//			int temp =arr[arr.length-1];
//			
//			for(j=arr.length-1;j>0;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[j]=temp
//					;
//			k--;
//		}
//	}
	
	
	void a(int arr[],int k) {
		int j=0;
		while(k>0) {
			int temp=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
			k--;
		}
		for(int i: arr)
		System.out.print(i +" ");
	}
	
	
	void print(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.println(arr[i] + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void p(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brootforceapproch obj=new brootforceapproch();
		int arr[]= {1,2,3,4,5,6,7};
		obj.a(arr, 2);
		//obj.p(arr, 6);
	}

}
