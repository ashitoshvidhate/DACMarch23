/*
25.Write a program to convert state of Float instance into byte,
short, int, long, float and double.
*/

class Program25{

    public static void main(String args[]){

        float fval = 405.67f;
        System.out.println("Float Value ="+fval);

        //First way to create the instance of any primitive datatype
        Float finstance = new Float(fval);
        System.out.println("Float instance ="+finstance);

        //Second way to create the instance of any primitive datatype
        Float finstance1 = Float.valueOf(fval);
        System.out.println("Float instance 2 ="+finstance1);

        byte bval = finstance.byteValue();
        System.out.println("Byte value ="+finstance);

        short shortval = finstance.shortValue();
        System.out.println("Short Value ="+shortval);

        int intval = finstance.intValue();
        System.out.println("Integer value ="+intval);

        long longval = finstance.longValue();
        System.out.println("Long Value ="+longval);

        float floatval = finstance.floatValue();
        System.out.println("Float Value ="+floatval);

        double doubleval = finstance.doubleValue();
        System.out.println("Double Value ="+doubleval);
    }

}