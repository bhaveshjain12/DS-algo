package arrays;

import java.util.Scanner;

public class Stringrev {
public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int n=sc.nextInt();
//    while(n-->0){
//    String str=sc.next();
//    String word[]=str.split("\\.");
//    String rev="";
//    for (int i = 0; i < word.length; i++) {
//		 word[i];
//		StringBuilder sb=new StringBuilder();
//    	sb.reverse();
//    	rev+=sb.toString();
//	}
//    System.out.println(rev);
//	}
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    in.nextLine();
    while(x>0)
    {

    String s=in.nextLine();
    // in.nextLine();
    String[] sd=s.split("\\.");
    for(int i=0;i<=sd.length-1;i++){
    StringBuilder input1 = new StringBuilder();
    input1.append(sd[i]);
    if(i!=(sd.length-1))
    System.out.print(input1.reverse()+".");

    else
    { System.out.print(input1.reverse());
    System.out.println();
    }
    }

    x--;
    }
}
}
