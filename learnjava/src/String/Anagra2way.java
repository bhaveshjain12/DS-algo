package String;

public class Anagra2way {
public static void main(String[] args) {
	String a="aab1234*&";
	String b="aba4321*&";
	boolean anagram=true;
	int aa[]=new int[256];
	int bb[]=new int[256];
	for(char c: a.toCharArray()) {
		int index=(int) c;
		aa[index]++;
	}
	for(char c: b.toCharArray()) {
		int index=(int) c;
		bb[index]++;
	}
	for(int i=0;i<256;i++) {
		if(aa[i]!=bb[i]) {
			anagram=false;
			break;
		}
	}
	if(anagram) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
