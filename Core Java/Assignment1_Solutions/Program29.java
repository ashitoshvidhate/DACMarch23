/*
29.Write a program to convert state of Double instance into byte,
short, int, long, float and double.

*/

class Program29{

    public static void main(String args[]){

        double d1 = 45678.9876;
        System.out.println("Double d1 ="+d1);

        Double d_instance = Double.valueOf(d1);
        System.out.println("Double instance ="+d_instance);

        byte bval = d_instance.byteValue();
        System.out.println("Byte ="+bval);

        short sval = d_instance.shortValue();
        System.out.println("Short value ="+sval);

        int ival = d_instance.intValue();
        System.out.println("Int Value ="+ival);

        long lval = d_instance.longValue();
        System.out.println("long value ="+lval);

        float fval = d_instance.floatValue();
        System.out.println("Float value ="+fval);

        double dval = d_instance.doubleValue();
        System.out.println("Double Value ="+dval);
    }
}