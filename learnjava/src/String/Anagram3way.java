package String;

public class Anagram3way {
public static void main(String[] args) {
	String a="aabbc";
	String b="cbbaa";
	int al[]=new int[256];
	boolean anagram=true;
	for(char c: a.toCharArray()) {
		int index=(int) c;
		al[index]++;
	}
	for(char c : b.toCharArray()) {
		int index=(int) c;
		al[index]--;
	}
	for(int i=0;i<256;i++) {
		if(al[i]!=0) {
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
