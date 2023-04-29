/*
Write a program to find minimum and maximum number as well as
to add two integer numbers using methods of Integer.
*/

class Program18{

    public static void main(String args[]){

        int a = 900;
        int b = 1890;

        System.out.println("Maximum Value ="+Integer.max(a,b));
        System.out.println("Minimum Value ="+Integer.min(a,b));

        int result = Integer.sum(a,b);
        System.out.println("Sum ="+result);
    }
}