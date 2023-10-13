// pgm to find duplicate elements in an arrray
package Samplepgms;
//import java.util.Scanner;

public class DupliArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ar[]=new int[] {2,2,4,5,4,3,3,6,6};
		//Scanner sc=new Scanner(System.in);
		//int ar[]=sc.nextInt();
		System.out.println("Diuplicate elements");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
					
				}
				
			}
		}
				

	}

}
