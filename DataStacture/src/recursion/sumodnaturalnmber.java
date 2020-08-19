package recursion;

public class sumodnaturalnmber {
public static void main(String[] args) {
	System.out.println(sum(25));
//	System.out.println(pow(3,5));
	//System.out.println(path(4,4));
}
static int sum(int n) {
	if(n==1) {
		return 1;   ////base case:
	}
	return n+sum(n-1); ////gernal form:
}
static int pow(int a , int b) {
	if(b==0) {
		return 1;
		
	}
	return a*pow(a,b-1);
}
static int path(int n,int m){
	if(n==1 || m==1)return 1;
	return path(n,m-1)+path(m,n-1);
}
}
