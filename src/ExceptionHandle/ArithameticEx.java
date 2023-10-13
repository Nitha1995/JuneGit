package ExceptionHandle;

public class ArithameticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=10,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithametic Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("hello");

		

	}

}

