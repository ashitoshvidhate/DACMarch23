/*
16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

*/

class Program16{
    public static void main(String args[]){

        int a = 703;
        System.out.println("Integer value of a ="+a);

        String strNumber = Integer.toString(a);
        System.out.println("String value of a ="+strNumber);

        Integer intinstance = new Integer(a);
        System.out.println("Integer instance ="+intinstance);

        String strinstance = new String(strNumber);
        Integer intinstance1 = new Integer(strinstance);
        System.out.println("String instance to integer instance ="+intinstance1);

        String binarydata = Integer.toBinaryString(a);
        System.out.println("BinaryString ="+binarydata);

        String octaldata = Integer.toOctalString(a);
        System.out.println("OctalString ="+octaldata);

        String hexadata = Integer.toHexString(a);
        System.out.println("Hexadecimal String ="+hexadata);

    }
}