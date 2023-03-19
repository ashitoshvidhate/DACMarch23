import java.util.*;
import java.io.*;

public class Pattern2_11{	
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			
			for(int z=2;z<=i;z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}
	
/*

*****
 *****
  *****
   *****
    *****

*/