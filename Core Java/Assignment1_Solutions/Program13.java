class Program13{

    public static void main(String args[]){
        short val = 245;
        System.out.println("Short value ="+val);

        String strVal = Short.toString(val);
        System.out.println("Short -->> String =="+strVal); //short value into String

        Short shortinstance = new Short(val);
        System.out.println("short instance = "+shortinstance); //Short value to short instance

        String strinstance = String.valueOf(strVal);
        Short shortinstance1 = new Short(strinstance);

        System.out.println(shortinstance1); //String instnace ==>> short instance 
    }
}