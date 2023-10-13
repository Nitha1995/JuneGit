package Arraypgms;
import java.util.Scanner;
public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
