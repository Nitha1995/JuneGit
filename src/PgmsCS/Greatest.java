//greatest among 3 numbers
package PgmsCS;

public class Greatest {

	public static void main(String[] args) {
		int a=20,b=30,c=40;
		if((a>b)&&(a>c)) {
			System.out.println( "  greater number is a ="+a);
			
		}
		else if((b>a)&&(b>c)) {
			System.out.println( "  greater number is b ="+b);
			
		}
		else {
			System.out.println( "  greater number is c ="+c);
		}

	}

}
