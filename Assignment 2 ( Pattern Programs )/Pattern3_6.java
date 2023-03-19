import java.util.*;
import java.io.*;

public class Pattern3_6{
	public static void main(String args[]){
		for(int i=0;i<=9-1;i++){
			for(int k=0;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=9-1-i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT 

 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

*/