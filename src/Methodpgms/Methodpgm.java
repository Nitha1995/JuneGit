package Methodpgms;

public class Methodpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgm ob=new Methodpgm();
		ob.add();
		ob.sub(20,60);
		int ans = ob.mul();
		System.out.println(ans);
		double divans=ob.div(34, 4);
		System.out.println(divans);
     }
	//method without returntype and without parameter
	public void add() {
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);	}
//method without retrun type and with parameter
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	//method with return type and without parameter
	public int mul() {
		int a=20,b=30;
		int c=a*b;
		return c;
		
	}
	//method with return type with parameter
	public double div(double a,double b) {
		double d=a/b;
		return d;
		
	}
}
