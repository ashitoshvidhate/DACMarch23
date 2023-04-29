class Program8{

    public static void main(String args[]){
        
        byte b =29;

        //8.a. byte value into String
       // String str = String.valueOf(b); ---1st way
       String str=Byte.toString(b); // --2nd way
        System.out.println("byte value into String ="+str);

        //8.b. byte value into Byte instance

        Byte byteinstance = Byte.valueOf(b);
        System.out.println("byte instance ="+byteinstance);

        //8.c String instance into byte instance

        String s45 = "123";
        String stringinstance = new String (s45);

        Byte byteinstance1 = new Byte(stringinstance);

        System.out.println("Byteinstance ="+byteinstance1);

    }
}