package OOPSConcepts;
class Animal{
	public void animalfood() {
		System.out.println("food");	}
}
class Tiger extends Animal{
	public void tigerfood() {
		System.out.println("Tigherfood");	}

	
}
class Lion extends Animal{
	public void lionfood() {
		System.out.println("Lionfood");	}
}
	

public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1=new Tiger();
		t1.animalfood();
		t1.tigerfood();
		Lion l1=new Lion();
		l1.lionfood();
		

	}

}
