/*
31.Read the documentation of NumberFormatException and try to
generate it in Java code. 
*/

class Program31{
    public static void main(String args[]){

        String str ="Ashitosh";
        int strNumber = Integer.parseInt(str);

        System.out.println("String number ="+strNumber);

        //java.lang.NumberFormatException: For input string: "Ashitosh"
    }
}