//Q.12 How do you remove duplicates from an array in place?

import java.util.*;
import java.io.*;

public class DuplicateRemDemo{

	public static int duplicatesremoved(int arr[],int n){
		
		if(n==0 || n==1)
			return n;
		
		int j=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
	}
	public static void main(String args[]){
		int arr[]={10,10,20,30,40,50,89,90,91,92,92};
		int length=arr.length;
		
		length=duplicatesremoved(arr,length);
		
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+" ");
	}
}