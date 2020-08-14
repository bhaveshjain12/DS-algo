package codechef;

import java.util.Scanner;

public class Q1 {
	public static double Atm(int wa,double tab){
		double charge=0.50;
		if(wa%5==0 && wa+0.50<=tab)
			return tab-wa-charge;
		return tab;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int wa=sc.nextInt();
		double tab=sc.nextDouble();
		System.out.println(String.format("%.2f", Atm(wa,tab)));;
	}

}
