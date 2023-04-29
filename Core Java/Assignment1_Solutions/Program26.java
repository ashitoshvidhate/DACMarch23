/*
26.Write a program to find minimum and maximum number as well as
to add two float numbers using methods of Float.
*/

class Program26{

    public static void main(String args[]){

        float f_val1 = 345.678f;
        float f_val2 = 4567.895f;

        System.out.println("Minumum Number ="+Float.min(f_val1,f_val2));
        System.out.println("Maximum Number ="+Float.max(f_val1,f_val2));
        System.out.println("Addition of "+f_val1+" and "+f_val2+" = "+Float.sum(f_val1,f_val2));

    }
}