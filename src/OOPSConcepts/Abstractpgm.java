package OOPSConcepts;
abstract class Car1
{
	abstract public  void acceleration();
	abstract public  void speedLimit();
	//public void music() {
		//System.out.println("music system working fine");
//	}

	
}
//put cursor on bmw then coming add umimplemented method select it then come @override
class Bmw extends Car1{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("BMw Accel");

		
	}

	@Override
	public void speedLimit() {
		// TODO Auto-generated method stub
		System.out.println("BMw speed");

		
	}
	
	
}

class Kia extends Car1{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("kia Accel");

		
	}

	@Override
	public void speedLimit() {
		// TODO Auto-generated method stub
		System.out.println("kia speed");

		
	}
	
	
}

public class Abstractpgm {

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.acceleration();
		b.speedLimit();
		//b.music();
		
	}

}
