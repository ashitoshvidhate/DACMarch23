/*
 Write a program to perform below operations on int type to
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer

*/

class Program15{

    public static void main(String args[]){
        int num = 9000;

        System.out.println("Total number of bits in Integer :"+Integer.SIZE);
        System.out.println("Total numbebr of bytes in Integer :"+Integer.BYTES);
        System.out.println("Minimum value of int :"+Integer.MIN_VALUE);
        System.out.println("Maximum value of int :"+Integer.MAX_VALUE);
    }
}