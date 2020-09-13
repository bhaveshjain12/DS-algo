package Arrays;

public class maxsumofindexandarr {

	static int arr[]=new int[]{10,1,2,3,4,5,6,7,8,9};
	
	static int maxSum() {
		int arrSum=0;
		int currVal=0;
		
		for(int i=0;i<arr.length;i++) {
			arrSum=arrSum +arr[i];
			currVal = currVal+(i*arr[i]);
		}
		
		int maxVal=arrSum;
		
		for(int i=1;i<arr.length;i++) {
			currVal=currVal + arrSum-arr.length*arr[arr.length-i];
			if(currVal>maxVal)
				maxVal=currVal;
		}
		return maxVal;
	}
	public static void main(String[] args) {
		System.out.println(maxSum());
	}
}
