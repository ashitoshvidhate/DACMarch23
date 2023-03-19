import java.util.*;
import java.io.*;

class Patternbasic1{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i); //if we print we get same number on entire row
									/* 11111
									   22222
									   33333
									   44444
									   55555*/
			}
			System.out.println();
		}
	}
}