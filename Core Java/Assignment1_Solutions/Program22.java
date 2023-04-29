/*
22. Write a program to find minimum and maximum number as well as
to add two long numbers using methods of Long.

*/

class Program22{

    public static void main(String args[]){
        long l1 =1000l;
        
        long l2 = 23456;

        long result = Long.sum(l1,l2);

        System.out.println("Maximum value in ="+Long.max(l1,l2));
        System.out.println("Minimum value ="+Long.min(l1,l2));

        System.out.println("Result ="+result);
    }
}