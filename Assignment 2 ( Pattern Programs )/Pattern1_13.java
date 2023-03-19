import java.util.*;
import java.io.*;

class Pattern1_13{
	public static void main(String args[]){
		
		/*
			     A
				B B
			   C C C
			  D D D D
			 E E E E E
		
		
		
		*/
	int alpha=64;
		for(int i=1;i<=5;i++){
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
	}
}