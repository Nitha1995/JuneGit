package Arraypgms;

import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Numbers");
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[3];
		for(int i=0;i<3;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered Numbers Are=");
		//for(int i=0;i<3;i++) {
			//System.out.println(ar[i]);
		//}
		//foreach
		for(int v:ar) {
			System.out.println(v);
		}

	}

}
