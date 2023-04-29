/*
17. Write a program to convert state of Integer instance into
byte, short, int, long, float and double.


*/

class Program17{
    public static void main(String args[]){

        int num = 5200;
        System.out.println("Value of int data ="+num);
        Integer int_instance = new Integer(num);

        System.out.println("Integer instance ="+int_instance);

        byte bnum = int_instance.byteValue();
        System.out.println("Value of byte data ="+bnum);

        short snum = int_instance.shortValue();
        System.out.println("value of short data ="+snum);

        int inum = int_instance.intValue();
        System.out.println("Value of int data ="+inum);

        long lnum = int_instance.longValue();
        System.out.println("Value of long data ="+lnum);

        float fnum = int_instance.floatValue();
        System.out.println("Value of float data ="+fnum);

        double dnum = int_instance.doubleValue();
        System.out.println("Value of double data ="+dnum);
    }
}