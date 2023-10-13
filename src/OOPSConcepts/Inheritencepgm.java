/*create a class named member having the following details 1.name 2.age 3.phoneno 4.address 5.salary
it also have method printdetails which print all details of member two classess create Employee and manager inherits the member class 
The Employer and manager classess have data members Specilization and department Assign the values to both classes by making an object of both class and 
print the same*/
//Hierarchical pgm

package OOPSConcepts;

class Member{
	String name="arya";
	int age=20;
	int phno=9987654;
	String Adress="THodupuzha";
	int salary=1000;
	public void printdetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phno="+phno);
		System.out.println("Adress="+Adress);
		System.out.println("salary="+salary);
  }
}
class Employee extends Member {
	String speciliz="it";
	//String department="manager";
	public void empdisplay() {
		System.out.println("details");
		
	}
	
}
class Manager extends Member{
	//String speci="msw";
	String dep="development";
	public void mandisplay() {
		System.out.println("Manager Details");
		
	}
	
}
public class Inheritencepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.printdetails();
		e.empdisplay();
		System.out.println(e.speciliz);
		//System.out.println(e.department);

		
		Manager m=new Manager();
		m.mandisplay();
		//System.out.println(m.speci);
		System.out.println(m.dep);

	}

}
