/*
27.Write a program to perform below operations on Double type to
get:
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double

*/

class Program27{

    public static void main(String args[]){

        double l =3457.789d;
        System.out.println("Double l="+l);

        System.out.println("Number of bits inDoublet datatype = "+Double.SIZE);
        System.out.println("Number of bytes in Double datatype ="+Double.BYTES);
        System.out.println("MINIMUM value ="+Double.MAX_VALUE);
        System.out.println("MAXIMUM Value ="+Double.MIN_VALUE);
    }
}