package Queue;


public class MainClass {
public static void main(String[] args) {
	Myqueue<Integer> mq= new Myqueue<>();
	mq.enqueue(10);
	mq.enqueue(20);
	mq.enqueue(30);

	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	mq.enqueue(300);
	System.out.println(mq.dequeue());
}
}






//q.add(12);
//q.add(22);
//q.add(32);
//System.out.println(q);
//
//System.out.println(q.remove());
//System.out.println(q.remove());
//System.out.println(q.element());