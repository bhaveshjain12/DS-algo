package arrays;

import java.util.Scanner;

public class StringBu {
		public static void main (String[] args)
	 {
        Scanner in = new Scanner(System.in);
//        int test = in.nextInt();
//        while(test-->0)
//        {
//            int N = in.nextInt();
//            int D = in.nextInt();
//            int a[]= new int[N];
//            for(int i=0; i<N; i++)
//            {
//               a[i] = in.nextInt();
//            }
//            StringBuffer s = new StringBuffer();
//            for(int i=D; i<N; i++ )
//            {
//                s.append(a[i]+" ");
//            }
//            System.out.println(s);
//            for(int i=0;i<D;i++)
//            {
//                s.append(a[i]+" ");
//            }
//            System.out.println(s);
//        }
        int t=in.nextInt();
        while(t-->0) {
        	int n=in.nextInt();
        	int d=in.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++) {
        		a[i]=in.nextInt();
        	}
        	StringBuffer s=new StringBuffer();
        	for(int i=n-1;i>=d;i--) {
        		s.append(a[i]+" ");
        	}
        	for(int i=0;i<d;i++) {
        		s.append(a[i]+" ");
        	}
        	System.out.println(s);
        }
}
}
