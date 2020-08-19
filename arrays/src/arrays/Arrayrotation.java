package arrays;

public class Arrayrotation {
//	void RotateArray(int arr[],int d,int n) {
//		for(int i=0;i<d;i++)
//			leftrotatebyone(arr,n);
//		
//	}
//	void leftrotatebyone(int arr[],int n) {
//		int i, temp;
//		temp=arr[0];
//		for(i=0;i<n-1;i++) {
//			arr[i]=arr[i+1];
//			arr[i]=temp;
//		}
//	}
//		void printarray(int arr[],int n) {
//			for(int i=0;i<n;i++)
//				System.out.print(arr[i] + " ");
//		
//	}
	void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
    void a(int arr[],int d,int n) {
    	for(int i=0;i<d;i++)
    		b(arr,n);
    }
    void b(int arr[],int n) {
    	int i;
    	int temp=arr[0];
    	for(i=0;i<n-1;i++) 
    		//temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i]=temp;
    	
    }
    	void p(int arr[],int n) {
    		for(int i=0;i<n;i++)
    			System.out.print(arr[i] + " ");
    	}
    

public static void main(String[] args) {

	Arrayrotation rotate=new Arrayrotation();
	int arr[]= {1,2,3,4,5,6,7};
	int n=arr.length;
	rotate.a(arr, 2, 7);
	rotate.p(arr, 7);
}
}
