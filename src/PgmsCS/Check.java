// Write a pgm to check if the 2 numbers are 23 and 45 are equal
package PgmsCS;

public class Check {

	public static void main(String[] args) {
		
		int a=23,b=45;
		int a1=55,b1=70;
		int a2=17;
		int second=a2%10;
		if(a==b)
		{
			System.out.println("2 numbers are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		//Assign values of variables a and b as 55 and 70 then check if both the conditions a<50 and a<b are true
		if((a1<50)&&(a1<b1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		//int a=17 print 2nd digit
		System.out.println(second);
		

	}

}
