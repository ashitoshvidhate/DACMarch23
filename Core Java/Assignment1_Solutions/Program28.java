/*
28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal
string(Note: Here you can use doubleToLongBits() method
along with methods of Long class).

*/

class Program28{

    public static void main(String args[]){

        double d1 = 2000.0989;
        
        //a. double value into String
        String strNumber = Double.toString(d1);
        System.out.println("String StrNumber ="+strNumber);

        //b.double value to double instance
        Double double_instance = Double.valueOf(d1);
        System.out.println("Double Instance ="+double_instance);

        //c. String instance into Double instance.
       // String str_instance = new String(strNumber);
       String str_instance = String.valueOf(strNumber);
        System.out.println("String instance ="+str_instance);

        /*
        d. double value into binary, octal and hexadecimal
        string(Note: Here you can use doubleToLongBits() method
        along with methods of Long class).*/

      

       String hexdata1 = Long.toHexString(Double.doubleToLongBits(d1));
        System.out.println("New Hexadecimal Double data ="+hexdata1);

        
        String binarydata = Long.toBinaryString(Double.doubleToLongBits(d1));
        System.out.println("Binary Long data ="+binarydata);

        String octaldata = Long.toOctalString(Double.doubleToLongBits(d1));
        System.out.println("Octal Double data ="+octaldata);

    }
}