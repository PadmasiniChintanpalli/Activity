package arrays;

import java.util.Scanner;

public class AddTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = {1,2,3,4,5};
		int[] sumarr = new int[arr1.length];
		for (int i=0; i<arr1.length;i++) {
			sumarr[i] = arr1[i] +arr2[i];
			
		}
		System.out.println("Sum of two arrays is:");
		for(int i=0;i<sumarr.length;i++) {
			System.out.println(sumarr[i]);
		}
		
	}



}
