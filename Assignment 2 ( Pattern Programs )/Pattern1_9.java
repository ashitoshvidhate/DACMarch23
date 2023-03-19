import java.util.*;
import java.io.*;

class Pattern1_9{
	public static void main(String args[]){
		/*
		
			A
		   A B
		  A B C
		 A B C D
		A B C D E
		
		*/
		
		int alpha = 64;
		
	for(int i=1;i<=5;i++){
		for(int k=4;k>=i;k--){
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++){
			System.out.print((char)(alpha+j)+" ");
		}
		System.out.println();
	}
}
}