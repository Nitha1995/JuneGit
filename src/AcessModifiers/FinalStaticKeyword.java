package AcessModifiers;

public class FinalStaticKeyword {
	String empname;
	static String companyname="luminar";
	final static float pi=3.14f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalStaticKeyword fs=new FinalStaticKeyword();
		System.out.println(fs.empname);
		System.out.println(companyname);
		System.out.println(companyname="luminar technolab");
		System.out.println(companyname);
		System.out.println(fs.pi);
		System.out.println(pi);
		//System.out.println(pi=8.9);
}

}
