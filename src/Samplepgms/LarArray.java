//Find Largest element in an array
package Samplepgms;

public class LarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {25,11,89,65,45};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest Element in an Array="+max);

	}

}
