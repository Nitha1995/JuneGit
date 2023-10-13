package jumbingstatements;

public class returnpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		  
		}
		 int x=sum();
		   System.out.println(x);

	}
	public static int sum() {
		int a=20,b=30,c;
		c=a+b;
		return c;
		
	}

}
