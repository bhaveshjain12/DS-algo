package clg;
import java.io.*;

public class Addtwonoinstring {
public static void main(String[] args) throws IOException {
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String a = r.readLine();
  a=a+" ";
  int t=0;
  String b="";
  int l=a.length();
  for(int i=0;i<l;i++){
      int m=(int)a.charAt(i);
      if(m>=48 && m<=57){
          b=b+a.charAt(i);
      }
      else if(b.length()!=0){
          int k=Integer.parseInt(b);
          t=t+k;
          b="";
      }
  }
  System.out.println(t);
;
}
}
