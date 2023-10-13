package pkg;

public class Operators {

	public static void main(String[] args) {
		//Arithametic operators
		        int a=20,b=10;
		           System.out.println("****Arithametical operators******");
		           System.out.println("a+b =" +(a+b));
		          System.out.println("a-b ="+(a-b));
		           System.out.println("a/b ="+(a/b));//quotient
		           System.out.println("a*b ="+(a*b));
		           System.out.println("a%b ="+(a%b));//remainder
		 //Assignment operators
		           System.out.println("****Assignment operators******");

		           System.out.println("a=b="+(a=b));//10
		           System.out.println("a+=b=" +(a+=b));//a=a+b 30
		           System.out.println(a+=b);
		           System.out.println("a-=b="+(a-=b));//a=a-b 10
		 //Relation operators
		           System.out.println("****Relational operators******");

		           int n1=30, n2=20;
		           System.out.println(n1<n2);
		           System.out.println(n1>n2);
		           System.out.println(n1==n2);
		           System.out.println(n1!=n2);
		 //logical operators
		           System.out.println("****logical operators******");
		           String username="abc";
		           String password="abc123";
		           System.out.println(username=="abc" && password=="abc123");//true
		           System.out.println(username=="abc1" || password=="abc123");//true
		           System.out.println(!(username=="abc1"));
		 //unary operator
		           System.out.println("****unary operators******");
		           //++ increment operator
		           //postincrement b++
		           //preincrement ++b
		           //decrement
		           int d=5 ;
		           int s=3;
		            System.out.println(d++);//5 first 5 print then increment but increment is not print
		            System.out.println(d);//6
		            System.out.println(++d);//7
		            System.out.println("decrement");
		            System.out.println(s--);//3
		            System.out.println(s);//2
		            System.out.println(--s);//
		 //Ternary operator
		            System.out.println("-----ternary operator----");
		            //condition?expression1:expression2;
		            int num1=20,num2=5;
		            int value =num1>num2?num1:num2;
		            System.out.println(value);
		            String v=num1>num2?"num1 is greater":"num2 is greater";
		            System.out.println(v);
		            
		            //swap two variables a=40,b=30
		            

		            

		           


		           
  }

}
