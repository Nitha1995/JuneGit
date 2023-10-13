package Arraypgms;
import java.util.Scanner;
public class Multiarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar=new int [3][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				ar[i][j]=sc.nextInt();
				System.out.println(ar[i][j]+" ");
				
				System.out.println(ar[i][j]);
			}
		}
		/*for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}*/

	}

}
