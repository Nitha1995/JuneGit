package Constructorpgms;

public class Constructpgm {
	int empid;
	String empname;
	String empdes;
	//parametrized constructor
	public Constructpgm(int empid,String empname,String empdes) {
		this.empid=empid;
		this.empname = empname;
		this.empdes = empdes;
		
		
	}
	public void Display() {
		//System.out.println("Empid="+empid);
		//System.out.println("Empname="+empname);
		System.out.println("Empdes="+empdes);


	}
	public void Display1() {
		System.out.println("Empid="+empid);
		System.out.println("Empname="+empname);
		System.out.println("Empdes="+empdes);


	}


	public static void main(String[] args) {
		
	Constructpgm emp=new Constructpgm(101,"abc","deve");
	Constructpgm emp2=new Constructpgm(102,"ab","Tester");

	System.out.println("empid="+emp.empid);
	System.out.println("empname="+emp.empname);
	emp.Display();
	emp2.Display1();


		

	}

}
