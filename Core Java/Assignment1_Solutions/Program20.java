/*
20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.

*/

class Program20{

    public static void main(String args[]){
        long l1 = 23456l;
        String strlval = Long.toString(l1);
        System.out.println("string value of long :"+strlval);

        Long l_instance = new Long(l1);
        System.out.println("Long instance value ="+l_instance);

        String name =Long.toString(l1);
        String str_instance = new String(name);
        Long long_instance = new Long(str_instance);
        System.out.println("String instance value ="+str_instance);
        System.out.println("Long instance value ="+long_instance);

        String binarydata = Long.toBinaryString(l1);
        System.out.println("Binary Long data ="+binarydata);

        
        String hexdata = Long.toHexString(l1);
        System.out.println("Hexadecimal Long data ="+hexdata);

        
        String octaldata = Long.toOctalString(l1);
        System.out.println("Octal Long data ="+octaldata);

    }
}