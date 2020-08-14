package array;

public class SelectionSort {
public static void main(String[] args) {
	int a[]= {1,5,23,21,7};
	int n=a.length;
	for(int i=0;i<n-1;i++) {
		int mi=i;
		for(int j=i;j<n;j++) {
			if(a[j]<a[mi]) {
				int temp=a[j];
				a[j]=a[mi];
				a[mi]=temp;
			}
		}
	}
	for(int e: a) {
		System.out.print(e+ " ");
	}
}
}
