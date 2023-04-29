/*
30.Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Double.

*/

class Program30{

    public static void main(String args[]){

        double d1 = 4567.89098;
        double d2 = 7890.87653;

        System.out.println("Maximum Value ="+Double.max(d1,d2));
        System.out.println("Minimum Value ="+Double.min(d1,d2));

        System.out.println("Sum of "+d1+" and "+d2+" = "+Double.sum(d1,d2));
    }
}