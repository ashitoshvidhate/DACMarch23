import java.util.*;
import java.io.*;
import java.time.*;

class Date{

    int day;
    int month;
    int year;

    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return this.day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return this.month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }

    public void getDayOfWeek(){
      LocalDate ld=LocalDate.of(year,month,day);
      System.out.println(ld.getDayOfWeek());
    }
}
class Program{
    public static void main(String args[]){
        Date d=new Date();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day :");
        int day=sc.nextInt(); 
        System.out.println("Enter month :");
        int month=sc.nextInt();
        System.out.println("Enter year :");
        int year=sc.nextInt();

      

     

     



       
    }
}