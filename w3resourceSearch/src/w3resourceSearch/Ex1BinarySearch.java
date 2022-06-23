package w3resourceSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1BinarySearch {
	public static void main(String[] args) {

		int arr[] = {9, 7, 5, 3, 4, 2, 4};

		Scanner scannerko = new Scanner(System.in);
		
		System.out.print("Enter a number you want to search: ");
		int search = scannerko.nextInt();
		
		int index = binarySearch(arr, search);
		System.out.println(Arrays.toString(arr));
		
		if(index != -1) {
			System.out.println(search + " is found at index " + index);
		}
		else {
			System.out.println(search + " is not within the array.");
		}
		

		
	}

	private static int binarySearch(int[] arr, int search) {
		
		quickSort(arr, 0, arr.length - 1);
		
		int low = 0;
		int high = arr.length - 1;
		
		
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = arr[middle];
			
			if(search > value) {
				low = middle + 1;
			}
			else if(search < value){
				high = middle - 1;
			}
			else {
				return middle;
			}
		}

		return -1;
		
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) return;
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start - 1;
		
		for(int j = start; j < end; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		
		
		return i;
	}


	
	
	
}
