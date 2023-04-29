/*14.Write a program to convert state of Short instance into byte,
short, int, long, float and double.
*/

class Program14{

    public static void main(String args[]){
        short val = 178;
        Short shortinstance = new Short(val);
        System.out.println("ShortInstance = "+shortinstance);

        byte bval = shortinstance.byteValue();
        System.out.println("Byte value ="+bval);

        short sval = shortinstance.shortValue();
        System.out.println("Short Value ="+sval);

        int ival = shortinstance.intValue();
        System.out.println("Integer Value ="+ival);

        long lval = shortinstance.longValue();
        System.out.println("Long value ="+lval);

        float fval = shortinstance.floatValue();
        System.out.println("Float Value ="+fval);

        double dval = shortinstance.doubleValue();
        System.out.println("Double Value ="+dval);

    }
}