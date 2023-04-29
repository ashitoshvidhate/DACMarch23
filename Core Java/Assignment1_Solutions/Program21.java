/*
21.Write a program to convert state of Long instance into byte,
short, int, long, float and double.
*/

class Program21{

    public static void main(String args[]){
        long l1 =89000;

        Long l_instance = new Long(l1);
        System.out.println("Long instance ="+l_instance);

        byte bval = l_instance.byteValue();
        System.out.println("Byte data ="+bval);

        short sval = l_instance.shortValue();
        System.out.println("Short data ="+sval);

        int ival = l_instance.intValue();
        System.out.println("Integer data ="+ival);

        float fval = l_instance.floatValue();
        System.out.println("float data ="+fval);

        double dval = l_instance.doubleValue();
        System.out.println("double data ="+dval);

        long lval = l_instance.longValue();
        System.out.println("Long data ="+lval);



        
    }
}