//Q.7  How do you find all pairs of an integer array whose sum is equal to a given number? 

import java.util.*;
import java.io.*;

public class PairsCount{	

	public static void getPairsCount(int arr[],int sum){
	
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==sum)
					count++;
			}
		}
		System.out.println("Count of pairs : "+count);
	}
	
	public static void main(String args[]){
		int arr[]={1,5,7,-1,7,6,0};
		getPairsCount(arr,6);
	
	}
}