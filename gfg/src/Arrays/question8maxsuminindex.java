package Arrays;

public class question8maxsuminindex {
	static int maxSum(int arr[],int n){
		int res=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			int currsum=0;
			
			for(int j=0;j<n;j++) {
				int index=(i+j)%n;
				currsum +=j * arr[index];
			}
			res=Math.max(res, currsum);
		}
		return res;
		
	}
	public static void main(String[] args) {
		int arr[]= {8,3,1,2};
		int n=arr.length;
		System.out.println(maxSum(arr,n));
	}

}
