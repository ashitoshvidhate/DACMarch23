/*
23.Write a program to perform below operations on float type to
get:
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float


*/

class Program23{

    public static void main(String args[]){

        float l =3457.789f;
        System.out.println("Float l="+l);

        System.out.println("Number of bits in Float datatype = "+Float.SIZE);
        System.out.println("Number of bytes in LFloatdatatype ="+Float.BYTES);
        System.out.println("MINIMUM value ="+Float.MAX_VALUE);
        System.out.println("MAXIMUM Value ="+Float.MIN_VALUE);
    }
}