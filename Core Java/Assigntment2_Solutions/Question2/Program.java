import java.util.*;
import java.io.*;

class BMIClaculator{
        double height;
        double weight;
        double bmi;
    
    BMIClaculator(double height,double weight){
        this.height=height;
        this.weight=weight;
    }

    public void setHeight(){
        this.height=height;
    }

    public void setWeight(){
        this.weight=weight;
    }

    public double getHeight(){
        return this.height;
    }

    public double getweight(){
        return this.weight;
    }

    public double calculateBMI(){
        bmi=weight/(height*height);
        return bmi;
    }
}

class Program{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height :");
    double h = sc.nextDouble();
    
    System.out.println("Enter weight :");
    double w =sc.nextDouble();
    BMIClaculator bmical = new BMIClaculator(h,w);
    double ans = bmical.calculateBMI();

    System.out.println("BMI = "+ans); 
}
}