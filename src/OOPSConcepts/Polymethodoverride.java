package OOPSConcepts;
 class Parent1{
	 public void phone() {
		 System.out.println("samsung");
	 }
	
}
 class Child1 extends Parent1{
	 //Right click source method overriding select parent
	 

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		super.phone();
		 System.out.println("iphone");

	}
	 
	
}

public class Polymethodoverride {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		c.phone();

	}

}
