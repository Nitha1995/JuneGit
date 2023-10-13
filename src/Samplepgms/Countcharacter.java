//java pgm to count total number of characters in a string
package Samplepgms;

import java.util.Scanner;

public class Countcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String ab=sc.nextLine();
		int count=0;
		//count each character except space
		for(int i=0;i<ab.length();i++) {
			if(ab.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println("count ="+count);

	}

}
