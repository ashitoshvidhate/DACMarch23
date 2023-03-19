import java.util.*;
import java.io.*;

class Pattern2_7{
	public static void main(String args[]){
		//Upper triangle
		for(int i=1;i<=9;i=i+2){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j=j+1){
				System.out.print("* ");
			}
			
			
			System.out.println();
			
		}
		
		//lower triangle
		
		for(int i=1;i<=9;i=i+2){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			
			for(int j=7;j>=i;j=j-1){
				System.out.print("* ");
			}
			System.out.println();
		}
}
}	

/*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 * * * * * * *
   * * * * *
     * * *
       *

*/