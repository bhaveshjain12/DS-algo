package ArrayList;

public class Pair<X ,Y > {
       X x;
       Y y;
       public Pair(X x,Y y) {
    	   this.x=x;
    	   this.y=y;
       }
       void getDescription() {
    	   System.out.println(x+ " and "+y);
       }
}
//genaric class