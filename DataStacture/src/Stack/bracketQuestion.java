package Stack;

import java.util.Scanner;
import java.util.Stack;

public class bracketQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	while(t-->0) {
		String s=sc.nextLine();
		Stack<Character> stack=new Stack<>();
		boolean isBalance=true;
		 for(int i=0;i<s.length();i++) {
			 char ch = s.charAt(i);
			 if(ch== '(' || ch== '{' || ch == '[') {
				 stack.push(ch);
				 continue;
			 }
			 if(stack.isEmpty()) {
				 isBalance=false;
				 break;
			 }
			 if( ch== ')' ) {
				 if(stack.peek()=='(') {
					 stack.pop();
				 }else {
					 isBalance=false;
					 break;
				 }
				 
			 }if( ch== ']' ) {
				 if(stack.peek()=='[') {
					 stack.pop();
				 }else {
					 isBalance=false;
					 break;
				 }
				 
			 }if( ch== '}' ) {
				 if(stack.peek()=='{') {
					 stack.pop();
				 }else {
					 isBalance=false;
					 break;
				 }
				 
			 }
				
		 if(!stack.isEmpty()) {
			 isBalance=false;
		 }
		 }
		 if(isBalance) {
			 System.out.println("Balanced");
		 }else {
			 System.out.println("Not Balanced");
		 }
		 }
		 
	}

}
