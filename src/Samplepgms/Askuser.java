// write a dowhile loop that asks the user to enter 2 numbers the numbers should be added and the sum is displayed
package Samplepgms;

import java.util.Scanner;

public class Askuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int Sum;
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);

		do {
			
	      System.out.println("Enter a number");
		  num1=sc.nextInt();
		 System.out.println("Enter 2nd number");
		  num2=sc.nextInt();
		  
		  Sum=num1+num2;
		  System.out.println("sum="+Sum);
		  System.out.println("do you want to continue y/n");
			ch=sc.next().charAt(0);

		  }
		  
		
		while( ch=='y'||ch=='y');
		
 }

}
