//Q.11.How do you search for an element in row-wise and column-wise sorted matrix?

import java.util.*;
import java.io.*;

public class MatrixSearch{
	
	public static void search(int[][]mat,int n,int x){
		
		
        int i = 0, j = n - 1;
        
 
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at " + i
                                 + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }
 
        System.out.print("n Element not found");
        return; 
    }
	
	
	public static void main(String args[]){
		int mat[][] = { { 5,10,15,20 },
                        { 6,12,18,24,30 },
                        { 7,14,21,28 },
                        { 8,16,24,32 } };
 
       
        search(mat, 4, 21);
	}
}