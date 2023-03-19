import java.util.*;
import java.io.*;

class Pattern1_18{
	public static void main(String args[]){
	int alpha=64;
		for(int r=5;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((char)(c+alpha)+" ");
			}
			System.out.println();
			}

	}
}
	/*
		A B C D E
		A B C D
		A B C
		A B
		A
	
	
	
	*/