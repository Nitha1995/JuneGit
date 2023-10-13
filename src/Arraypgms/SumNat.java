//Sum of first n natural numbers
package Arraypgms;
import java.util.Scanner;
public class SumNat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Entrer the numbers");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		for ( i=0;i<num;i++)
		{
			sum = sum +i;

		}
		System.out.println("sum of numbers="+sum);

//2nd method
		System.out.println("Entrer the numbers");
		Scanner sc1=new Scanner(System.in);
		int[] arr=new int[10];
		int sum1=0;
		
		for ( i=0;i<9;i++)
		{
			arr[i]=sc1.nextInt();
			sum1=sum1+arr[i];

		}
		System.out.println("sum of numbers="+sum1);

		
	}

}
