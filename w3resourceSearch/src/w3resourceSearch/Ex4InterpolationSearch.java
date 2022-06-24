package w3resourceSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4InterpolationSearch {
	public static void main(String[] args) {
		
	int arr[] = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
	
	System.out.println(Arrays.toString(arr));
		
	Scanner scannerko = new Scanner(System.in);
	
	System.out.print("Enter a value you want to search: ");
	int value = scannerko.nextInt();
	
	
	int index = interpolationSearch(arr, value);
	
	if(index > -1) System.out.print( value +" is found at " + index);
	else System.out.print(value + " is not found in the array");
	
	
	}

	private static int interpolationSearch(int[] arr, int value) {
		
		int high = arr.length -1;
		int low = 0;
	
		while(value >= arr[low] && value <= arr[high] && low <= high) {
			
			int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
			
			if(arr[probe] == value) {
				return probe;
			}
			else if(arr[probe] < value) {
				low = probe + 1;
			}
			else {
				high = probe - 1;
			}
			
		}
		
		return -1;
	}
}
