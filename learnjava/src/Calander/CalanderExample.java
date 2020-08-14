package Calander;

import java.util.Calendar;

public class CalanderExample {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.get(Calendar.YEAR));
	System.out.println(cal.get(Calendar.MONTH));
}
}
