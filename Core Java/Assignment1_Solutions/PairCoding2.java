import java.util.*;
import java.io.*;

class PairCoding2{

     public static int klargest (int[] arr, int K)
    {
        
        Arrays.sort(arr);
 
        
        return arr[K + 1];
    }

    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size:");
	int size=sc.nextInt();
	
	int arr[]=new int[size];
	System.out.println("Enter array elements:");
	
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Array contains:");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"\t");
	}

    System.out.println(" ");
    System.out.println("Enter K Value :");
    int K = sc.nextInt();
    System.out.print(K+"th largest element is "+ klargest(arr, K));
    
       
    }
    
}