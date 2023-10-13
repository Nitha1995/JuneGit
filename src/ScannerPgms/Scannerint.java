package ScannerPgms;
import java.util.Scanner;
public class Scannerint {
	int empid;//instance variable
	String empname;//instance variable
	String empdesg;
	//local variable
	//instance variable
	//static variable
static String empcom="luminar";//static variable without object we have to acess
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scannerint a=new Scannerint();
	System.out.println(a.empid=101);
	System.out.println(a.empname="rahul");
	System.out.println(a.empdesg="dev");
	System.out.println(empcom);//direct calling
	sal();
	//using scanner
	
	System.out.println("Enter a num");
	Scanner sc=new Scanner(System.in);
	//sc.nextInt();
	int ab=sc.nextInt();
	System.out.println("value="+ab);
	//read decimal value
	System.out.println("Enter a decimal num");

	double b=sc.nextDouble();
	System.out.println("value="+b);
	
	}
	public  void emp() {
		int sal=1000;//local variable
	}
	public static void sal() {
		int sal=1222;
	}

}
