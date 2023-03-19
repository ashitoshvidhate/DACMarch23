import java.util.*;
import java.io.*;

public class Pattern2_12{
	public static void main(String args[]){
		int count=5;
		for(int i=count;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			if(i==0)
				break;
			System.out.println();
		}
		
		for(int i=1;i<=count;i++){
			if(i==1)
				continue;
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

*****
****
***
**
*
**
***
****
*****


*/
			