/*
19.Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long


*/

class Program19{

    public static void main(String args[]){

        long l =345789l;
        System.out.println("Long l="+l);

        System.out.println("Number of bits in Long datatype = "+Long.SIZE);
        System.out.println("Number of bytes in Long datatype ="+Long.BYTES);
        System.out.println("MINIMUM value ="+Long.MAX_VALUE);
        System.out.println("MAXIMUM Value ="+Long.MIN_VALUE);
    }
}