//Q.6 How do you find a number occurring the odd number of times in an array?

import java.util.*;
import java.io.*;

public class CountOdd{
	
	public static int countoddno(int arr[]){
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				count++;
		}
		
		return count;
		
	}
	public static void main(String args[]){
		
		int arr[]={10,21,34,57,88,90,97,43};
		System.out.println("Odd numbers count = "+countoddno(arr));
	}
}