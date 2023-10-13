package Methodpgms;

import java.util.Scanner;

public class Vowelcount {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Vowelcount v=new Vowelcount();
//int a=v.countvowel();
		Scanner sc=new Scanner(System.in);
		System.out.println("input the string");
		String str =sc.next();
		countvowel(str);

	}
	public static void countvowel(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
				//return count;

				

				
				
			}

			
		}
		System.out.println("no of vowels="+count);



		
		
	}

}
