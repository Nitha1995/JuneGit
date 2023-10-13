package Methodpgms;
import java.util.*;
class  AverageSum{
	public void  average() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n1=in.nextInt();
		System.out.println("Enter a 2nd number");
		int n2=in.nextInt();
		System.out.println("Enter a 3rd number");
		int n3=in.nextInt();
		int n4=n1+n2+n3/3;
		System.out.println("Average of 3 numbers is="+n4);
		
		
		
	}
}

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageSum s=new AverageSum();
		s.average();
		

	}

}
