package Arraypgms;
import java.util.Scanner;


public class SingledimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Numbers");
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[3];
		for(int i=0;i<3;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered Numbers Are=");
		for(int i=0;i<3;i++) {
			System.out.println(ar[i]);
		}
		//String Array
		System.out.println("Enter Fruits");
		Scanner sca=new Scanner(System.in);
		System.out.println("please enter string");
		String[] string=new String[sca.nextInt()];
		sca.nextLine();
		for(int i=0;i<string.length;i++) {
			string[i]=sc.nextLine();
		}
		
		System.out.println("you have entered");
		for(String str:string) {
			System.out.println(str);
		}
		
		
				
				
		
	
		

	}

}
