package PriorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
//	
//		PriorityQueue<String> pq=new PriorityQueue<>();
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}