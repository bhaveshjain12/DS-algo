package PriorityQueue;

import java.util.*;

public class question1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			while(n-->0) {
				int z=sc.nextInt();
				int k=sc.nextInt();
				int a[]=new int[z];
				for(int i=0;i<z;i++) {
					a[i]=sc.nextInt();
				}
				
				PriorityQueue<Integer> pq=new PriorityQueue<>();
				for(int i=0;i<z;i++) {
					if(i<k) {
						pq.add(a[i]);
					}
					else {
						if(pq.peek()<a[i]) {
							pq.poll();
							pq.add(a[i]);
						}
					}
				}
					
				
				
				ArrayList<Integer> ans=new ArrayList<>(pq);
				Collections.sort(ans, Collections.reverseOrder());
				
				for(int w:ans) {
					System.out.print(w + " ");
				}
				System.out.println();
			}
	    }
	}

