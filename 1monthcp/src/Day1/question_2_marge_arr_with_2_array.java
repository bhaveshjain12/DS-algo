package Day1;

import java.util.Arrays;

public class question_2_marge_arr_with_2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {1,4,7,8,10};
		int d[]= {2,3,9};
		Marge(s,d);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(d));
		
	}
	static void Marge(int x[],int y[]) {
		int a=x.length;
		int b=y.length;
		for(int i=0;i<a;i++) {
			if(x[i]>y[0]) {
				int temp=x[i];
				x[i]=y[0];
				y[0]=temp;
			
				int first  =  y[0];
				int k;
				for (k = 1; k < b && y[k] < first; k++) {
					y[k-1]=y[k];				
			}
			y[k-1]=first;
		}
	}
}
}
//		int m = X.length;
//		int n = Y.length;
//
//		// consider each element X[i] of array X and ignore the element
//		// if it is already in correct order else swap it with next smaller
//		// element which happens to be first element of Y
//		for (int i = 0; i < m; i++)
//		{
//			// compare current element of X[] with first element of Y[]
//			if (X[i] > Y[0])
//			{
//				// swap (X[i], Y[0])
//				int temp = X[i];
//				X[i] = Y[0];
//				Y[0] = temp;
//
//				int first = Y[0];
//
//				// move Y[0] to its correct position to maintain sorted
//				// order of Y[]. Note: Y[1..n-1] is already sorted
//				int k;
//				for (k = 1; k < n && Y[k] < first; k++) {
//					Y[k - 1] = Y[k];
//				}
//
//				Y[k - 1] = first;
//			}
//		}
//	}
//}