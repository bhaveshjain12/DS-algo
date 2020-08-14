package userInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
	private int id;
	private double cgpa;
	private String fname;
	
	public Student(int id,double cgpa,String fname) {
		super();
		this.id=id;
		this.fname=fname;
		this.cgpa=cgpa;
	}
	public int getid() {
		return id;
	}
	public double getcgpa() {
		return cgpa;
	}
	public String getfname() {
		return fname;
	}
}
public class ScanneraUserInput {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int testCases=Integer.parseInt(sc.nextLine());
		List<Student> studentList=new ArrayList<Student>();
		while(testCases --> 0) {
			int id=sc.nextInt();
			String fname=sc.next();
			double cgpa=sc.nextDouble();
			Student st=new Student(id,cgpa,fname);
			studentList.add(st);
			
		}
		Collections.sort(studentList, Comparator.comparing(Student::getid).reversed().
			thenComparing(Student::getfname).thenComparing(Student::getcgpa));
		for(Student st: studentList) {
			System.out.println(st.getfname());
		}
	}
//		System.out.println("Entern n and m:");
//		int n= sc.nextInt();
//		int m=sc.nextInt();
//		if(n<0||m<0) {
//			System.out.println("n or m should not br negitive");
//			return;
//			}
//		if(n==0 || m==0) {
//			System.out.println("n or m should not to be equal to zero");
//			return;
//		}
//		System.out.println(power(n,m));
//	}
}
