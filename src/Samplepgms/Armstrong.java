// check no is armstrong or not eg(153=1*1*1+5*5*5+3*3*3)
package Samplepgms;
import java.util.*;
 class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,arm=0,rem,c;
		System.out.println("Enter Any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)*arm;
			n=n/10;
		}
		if(c==arm) 
			System.out.println("armstrong");
		
		else 
			System.out.println(" not armstrong");

		
		
	}

}
