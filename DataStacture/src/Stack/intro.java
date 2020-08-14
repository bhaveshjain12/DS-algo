package Stack;

public class intro {
public static void main(String[] args) throws Exception {
	//Stack <Integer> stack=new Stack<>();
	MyStack <Integer> stack=new MyStack<>();
//	stack.push(12);
//	stack.push(15);
//	stack.push(16);
	int popped= stack.pop();
	System.out.println(popped);
//	popped= stack.pop();
//	popped= stack.pop();
//	System.out.println(popped);
	int peeked=stack.peek();
	System.out.println(peeked);
}
}
