import java.util.*;
import java.io.*;

class Pattern1_7{
	public static void main(String args[]){
		/*
		
				1
			   1 2
			  1 2 3
			 1 2 3 4
			1 2 3 4 5
			
		*/
		
		for(int i=1;i<=5;i++){
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}