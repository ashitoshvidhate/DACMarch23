//Q3. How do you find the second-largest number in the array?

import java.util.*;
import java.io.*;

public class SecondLargestArray{

	public static int secondlargest(int arr[],int n){
		int temp;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				
				if(arr[i] > arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[n-2];
	}
				
	public static void main(String args[]){
			
		int arr[]={400,100,200,500,300,600,800};
		int n=arr.length;
		System.out.println("Second Largest element in array :"+secondlargest(arr,n));
		
	}
}