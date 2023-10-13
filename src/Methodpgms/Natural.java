// write a pgm to display n terms of natural numbers and their sum
package Methodpgms;
import java.util.*;
class Sum{
	public void sum() {
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	System.out.println("first n natural numbers are"+n);
	for(i=1;i<=n;i++) {
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println("the sum of natural numbers up to"+n+"terms"+sum);
	}
	
}

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Sum n=new Sum();
		n.sum();
		

	}

}
