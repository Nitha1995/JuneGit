package OOPSConcepts;
class Parent{
	int a=20,b=30;
	public void add() {
		System.out.println("add");
		
	}
}
class Child extends Parent{
	public void sub() {
		System.out.println("sub");
	}
}

public class Singleinher {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.add();
		c.sub();
		System.out.println(c.a);
		System.out.println(c.b);
		

	}

}
