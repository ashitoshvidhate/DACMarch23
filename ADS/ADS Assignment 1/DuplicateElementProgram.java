//Q.9.How do you find duplicate numbers in an array if it contains multiple duplicates?

import java.util.*;
import java.io.*;

public class DuplicateElementProgram{
		
	public static void findduplicate(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
					
			}
		}
	}
	public static void main(String [] args){
		
		int arr[]=new int[]{10,20,30,30,30,40,40,50,10,15,45,25,25,35};
		System.out.println("Duplicate elements in array :");
		findduplicate(arr);
		
	}
}