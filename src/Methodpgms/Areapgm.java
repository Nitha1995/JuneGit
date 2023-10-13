package Methodpgms;

public class Areapgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areapgm ob=new Areapgm();
		ob.areacircle();
		ob.arearec(20,60);
		int ans = ob.areasq();
		System.out.println(ans);
		double divans=ob.areatri(34, 4);
		System.out.println(divans);

	}
	//method without returntype and without parameter

	public void areacircle() {
		int r=20;
		double ar =3.14*r*r;
		System.out.println(ar);	}
	//method without retrun type and with parameter
		public void arearec(int l,int w) {
			int arrec=l*w;
			System.out.println(arrec);
		}
		//method with return type and without parameter
		public int areasq() {
			int side1=20,side2=50;
			int c=side1*side2;
			return c;
			
		}
		//method with return type with parameter
		public double areatri(double b,double h) {
			double d=0.5*b*h;
			return d;
			
		}

}
