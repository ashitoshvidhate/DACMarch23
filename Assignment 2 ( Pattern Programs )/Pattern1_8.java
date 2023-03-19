import java.util.*;
import java.io.*;

class Pattern1_8{
	public static void main(String args[]){
		/*
		
			5
		   5 4
		  5 4 3
		 5 4 3 2
		5 4 3 2 1
		*/
		
		for(int i=5;i>=1;i--){
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				System.out.print(j+" ");
			}
			
			
			System.out.println();
		}
	}
	
}