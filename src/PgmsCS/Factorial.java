//pgm to check factorial of number
//5!=5*4*3*2*1;
package PgmsCS;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,facto=1;
		int num=5;
		for(i=1;i<=num;i++) {
			facto=facto*i;
			
		}
		System.out.println(facto);

	}

}
