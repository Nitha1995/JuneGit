//write a pgm to create a class called vehicle witha method drive().create a subclass called car that overridesthe drive()method to print"repairing a car";
package OOPSConcepts;
class Vehicle{
	public void drive() {
		System.out.println("repairing Vehicle");
		
		
	}
}
class Car extends Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("Repairing a Car");
	}
	
}

public class MethodOverridepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.drive();
		

	}

}
