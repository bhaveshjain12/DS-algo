/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Bhavesh Jain
 *
 */
public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<=100;i++)
//		{
//			if(i == 35) {
//				break;
//			}
//			System.out.println(i);
//		}
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n;i>=n;i++) {
			if(i<0) {
				break;
			}
			System.out.println(i);
		}
	}

}
