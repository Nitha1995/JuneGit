package OOPSConcepts;

public class Polymormethodoverloding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Polymormethodoverloding p=new Polymormethodoverloding();
		p.add();
		p.add(2,2.5);
		p.add(3,2.5);
		p.add(4,4.5);
		p.add(2,3,4);
}
	public void add() {
		System.out.println();
		
	}

	public void add(int a,int b) {
		System.out.println(a+b);

		
	}
public void add(int a,double b) {
	System.out.println(a+b);

		
	
	}
	
public void add(double a,int b) {
	System.out.println(a+b);

	
}
public void add(int a,int b,int c) {
	System.out.println(a+b+c);

	}
}
