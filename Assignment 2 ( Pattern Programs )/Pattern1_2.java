import java.util.*;
import java.io.*;

class Pattern1_2{
	public static void main(String args[]){
		
		/* A
		   AB
		   ABC
		   ABCD
		   ABCDE*/
		   
		int alpha=65;
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(alpha+j));
			}
			System.out.println();
		}
	}
}