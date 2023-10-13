package OOPSConcepts;
class Emp5{
	private String des;
	private String name;
	//right click source-generate getters and setters-tick name and des and last generate
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp5 ob=new Emp5();
		ob.setName("abc");
		System.out.println(ob.getName());
		ob.setDes("Manager");
		System.out.println(ob.getDes());


	}

}
