//pgm to check whether palindrome or not
//logic 545,151,343,171
package PgmsCS;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n=454;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		}

	}

}
