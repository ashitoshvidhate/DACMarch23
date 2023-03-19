import java.util.*;
import java.io.*;

public class Pattern2_9{
	public static void main(String args[]){
		//upper triangle
		
		for(int i=1;i<=5;i++){
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower triangle
		
		for(int i=1;i<=5;i++){
			for(int k=0;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*


     *
    **
   ***
  ****
 *****
  ****
   ***
    **
     *





*/