//write java pgm end with given string language
package Samplepgms;

import java.util.Scanner;

public class Stringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String ab=sc.nextLine();
		//System.out.println("Enter a another String");
		//String ac=sc.nextLine();
		if(ab.endsWith("language")) {
			System.out.println("string pgm end with word language");
		}
		else {
			System.out.println("string pgm not end with word language");

			}
		}

}
