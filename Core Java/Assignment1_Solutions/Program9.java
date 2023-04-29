class Program9{

    public static void main(String args[]){
        
        byte value = 100; //byte value holding value 100
        Byte bs = new Byte(value);// byte stream contains value 100

        System.out.println("Byte instance ="+bs);

        byte bytenum = bs.byteValue();
        System.out.println("byte num ="+bytenum);

        short shortnum = bs.shortValue();
        System.out.println("Short num ="+shortnum);

        int intnum = bs.intValue();
        System.out.println("Int num = "+intnum);

        float floatnum = bs.floatValue();
        System.out.println("Float num ="+floatnum);

        double doublenum = bs.doubleValue();
        System.out.println("Double num ="+doublenum);
        
    }
}