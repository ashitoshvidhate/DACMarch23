import java.util.*;
import java.io.*;

class Pattern1_14{
	public static void main(String args[]){
		for(int r=5;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
			}

	}
}
			/*
				1 2 3 4 5
				1 2 3 4
				1 2 3
				1 2
				1
			
			*/