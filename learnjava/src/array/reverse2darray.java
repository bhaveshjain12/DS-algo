package array;

import java.util.Scanner;

public class reverse2darray {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter row cols");
     int row=sc.nextInt();
     int cols=sc.nextInt();

     int a[][]=new int [row][cols];
     int b[][]=new int [cols][row];
     System.out.println("enter a");
     for(int i=0;i<row;i++){
         for(int j=0;j<cols;j++){
             a[i][j]=sc.nextInt();
//             System.out.println(a[i][j]);
         }
        // System.out.println(" ");
     }
     for(int i=0;i<cols;i++){
         for(int j=0;j<row;j++){
      
         // System.out.println(b[j][i]);
         }
        // System.out.println(" ");
     }
}
}
