//check whether string is palindrome or not
package Samplepgms;
import java.util.Scanner;

public class Stringpali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
		String rev="";
		int strlen=s.length();
		for(int i=(strlen-1);i>=0;i--) {
			rev=rev+s.charAt(i);}
			
		
		if(s.equals(rev)) { 
	System.out.println("pali");}
		
		else {
			System.out.println("not pali");}
		
		
		

	}

}
