/*
24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.

*/

class Program24{

    public static void main(String args[]){
         float fval = 4567.895f;
         String strFloat = String.valueOf(fval);

         System.out.println("Float to String = "+strFloat);

         Float f_instance = new Float(fval);
         System.out.println("Float instance ="+f_instance);

         String str_instance = new String("1345.67f");
         Float f_instance1 = new Float(str_instance);

         System.out.println("String instance to float ==>"+f_instance1);

    //     String binarydata = Float.toBinaryString(fval);
    //    System.out.println("Binary Float data ="+binarydata);

        
        String hexdata = Float.toHexString(fval);
        System.out.println("Binary Float data ="+hexdata);

        
  //      String octaldata = Float.toOctalString(fval);
    //    System.out.println("Binary Float data ="+octaldata);
    }
}