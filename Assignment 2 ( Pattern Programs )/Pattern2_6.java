import java.util.*;
import java.io.*;

class Pattern2_6{
	public static void main(String args[]){
		int size=5;
		
    for (int i = 0; i < size; i++) {
      
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      
      for (int k = 0; k < (size - i) * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }  
	}
}

/*
*********
 *******
  *****
   ***
    *

*/
			