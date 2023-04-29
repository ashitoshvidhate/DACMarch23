import java.util.*;
import java.io.*;

class PairCoding3{

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int min = sc.nextInt();

        int total_min_day = 60*24;
        int total_year_day = 60*24*365;

        int no_years = min /total_year_day;

        int carry = min %total_year_day;

       // int rem = min - (no_years*365);
        
        int no_days = (min/60/24)%365;

        System.out.println("Total years ="+no_years);
        System.out.println("Total no of days ="+no_days);
    }
}