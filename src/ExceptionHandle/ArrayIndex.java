package ExceptionHandle;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] ar=new int[2];
			ar[0]=23;
			System.out.println(ar[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("ArrayIndex");
			
		}

	}

}
