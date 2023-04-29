//Q.5. How do you find the largest and smallest number in an unsorted integer array? 

import java.util.*;
import java.io.*;

public class LargestSmallest{
	
	public static void largestsmallest(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest element in array :"+arr[0]);
		System.out.println("Largest element in array :"+arr[arr.length-1]);
		
	}
	public static void main(String args[]){
		
		int arr[]={50,44,67,33,31,78,3,89,75};
		largestsmallest(arr);
	}
}