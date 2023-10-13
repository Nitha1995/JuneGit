package OOPSConcepts;
class Shape{
	public void display() {
		System.out.println("display");
	}
}
class Rectangle extends Shape{
	public void volume() {
		System.out.println("inside volume");
	}
}
class Cube extends Rectangle{
	public void area() {
		System.out.println("inside area");
	}
}



public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=new Cube();
		c.display();
		c.area();
c.volume();
		
		

	}

}
