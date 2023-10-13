package OOPSConcepts;
interface Calc{
	public void add();
	public void sub();
}
interface AdvCal{
	public void square();
}
class SimpleCal implements Calc,AdvCal
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("adding");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("substracting");

		
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("square");

		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCal c=new SimpleCal();
		c.add();
		c.sub();

	}

}
