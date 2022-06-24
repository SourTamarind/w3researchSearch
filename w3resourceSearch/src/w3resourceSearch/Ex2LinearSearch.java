package w3resourceSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2LinearSearch {
	public static void main(String[] args) {
		
	/*
	Write a Java program to find a specified element in a given array of elements using Linear Search.
	 */
		
		Scanner scannerko = new Scanner(System.in);
		int arr[] = {3, 2, 4, 5, 6, 6, 7, 8, 9, 9, 0, 9};
		
		System.out.print("Enter a value you want to search: ");
		int value = scannerko.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.print(value + " found at: " + linearSearch(arr, value));
		 
	}

	private static int linearSearch(int[] arr, int value) {
		
		for(int i = 0; i < arr.length; i++) {
			if(value == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
