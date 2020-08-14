package clg;

import java.util.Scanner;

public class qu2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String str=Integer.toString(num);
	char[] ch=str.toCharArray();
	int flag=0;
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length-1;j++) {
			if(ch[i]==ch[j] && i==j+1) flag=1;
			if(ch[i]==ch[j] && ch[i+1]==ch[j+1])flag=1;
		}
	}
	if(flag==1) {
		System.out.println(" good number");
	}else {
		System.out.println("bad number");
	}
	}

}
