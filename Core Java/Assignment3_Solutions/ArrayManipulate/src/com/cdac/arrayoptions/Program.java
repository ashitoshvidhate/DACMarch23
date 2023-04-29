package com.cdac.arrayoptions;

import java.util.*;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	private static int[] acceptArray(int size) {
		// TODO Auto-generated method stub
		int[] arr = new int[size];

		System.out.println("Enter Array elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		if (arr != null) {
			for (int element : arr)
				System.out.print(element + " ");
		}
		System.out.println();
	}

	private static void sumOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int element : arr)
			sum += element;

		System.out.println("Sum of Array : " + sum);
		System.out.println();
	}

	private static void averageOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		avg = sum / arr.length;
		System.out.println("Average of Array :" + avg);
	}

	private static void largestOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element in Array :" + max);

	}

	private static void smallestOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest element in Array :" + min);
	}
	
	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		System.out.println("Sorted array :"+Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int arr[] = Program.acceptArray(size);
		System.out.print("Contents of array :");
		Program.printArray(arr);

		Program.sumOfArray(arr);

		Program.averageOfArray(arr);
		Program.largestOfArray(arr);
		Program.smallestOfArray(arr);
		Program.sortArray(arr);
	}

	

	

}
