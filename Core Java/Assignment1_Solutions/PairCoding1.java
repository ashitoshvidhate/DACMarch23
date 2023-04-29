import java.util.*;
import java.io.*;

class PairCoding1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = Integer.parseInt(sc.nextLine());

        int temp=num;
        int digit=0;
        int sum=0;
        if ( num >= 10 && num <=1000){

            while(temp!=0){
                digit = temp%10;
                sum = sum + digit;
                temp = temp/10;

            }
            System.out.println("Sum of digits of "+num+" = "+sum);
            
        }
        else{
            System.out.println("Number out of range!");
        }
        
    }
}