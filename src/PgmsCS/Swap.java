package PgmsCS;

public class Swap {

	public static void main(String[] args) {
	//swap two variables using variable a=30 b=40
		//using three variable
		System.out.println("using 3 variable");

		int a=30,b=40;
		System.out.println("before swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//logic
		int temp=a;//temp=30
		a=b;//a=40
		b=temp;//b=30
		System.out.println(" Afterswap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//using 2 variable without a
		System.out.println("using 2 variable");
		System.out.println("before swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//logic
		a=a+b;//a=30+40 a=70
		b=a-b;//b=70-40 b=30
		a=a-b;//a=70-30 a=40
		System.out.println(" Afterswap");
		System.out.println("a="+a);//a=40
		System.out.println("b="+b);//b=30
		/*System.out.println("using single statement");
		b=a+b-(a=b);//
		System.out.println(" Afterswap");
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		}

}
