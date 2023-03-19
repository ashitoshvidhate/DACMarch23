import java.util.*;
import java.io.*;

public class Pattern3_5{
	public static void main(String args[]){
		for(int i=9;i>=1;i--){
			for(int k=1;k<=(2*i-2);k++){
				System.out.print(" ");
			}
			for(int j=i;j<=9;j++){
				System.out.print(j+" ");
			}
			for(int l=8;l>=i;l--){
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT

                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1


*/