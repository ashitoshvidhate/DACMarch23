import java.util.*;
import java.io.*;

public class HollowInvertedHalfPyramid{
	public static void main(String args[]){
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
			if(i==1 || j==6|| i==j)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT

******
*   *
*  *
* *
**
*






*/