package Samplepgms;
import java.util.Scanner;
public class Countarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countP=0,countN=0,countZ=0,i;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 numbers");
		for(i=0;i<10;i++) {
			arr[i] =sc.nextInt();
			if(arr[i]>0)
				countP++;
				else if(arr[i]<0)
					countN++;
				else
					countZ++;
					
				}
		System.out.println("positive numbers"+countP);
		System.out.println("negative numbers"+countN);
		System.out.println("Number of Zeros"+countZ);
   }

}
