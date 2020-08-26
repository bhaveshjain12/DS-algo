package String;

public class first {
	public static void main(String[] args) {
		int n= 123456789;
		System.out.println(thousandSeparator(n));
	}

	    public static String thousandSeparator(int n) {
	        StringBuffer s=new StringBuffer(String.valueOf(n));
	        for(int i=3;i<s.length();i+=4){
	            s.insert(s.length()-i,'.');
	        }
	        return s.toString();
	    }
	}

