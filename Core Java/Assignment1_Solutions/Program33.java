/*
33. Pass integer, float and double value from command line. Parse
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
*/

class Program33{

    public static void main(String args[]){
        double result;
        int choice = Integer.parseInt(args[0]); 
       float f =Float.parseFloat (args[1]);

       double d = Double.parseDouble(args[2]);

       switch(choice){
            case 1:
                result = f+d;
                System.out.println("Addition ="+result);
                break;
            case 2:
                result = f-d;
                System.out.println("Subtraction ="+result);
                break;
            case 3:
                result = f*d;
                System.out.println("Multiplication ="+result);
                break;
            case 4:
                result = f/d;
                System.out.println("Division ="+result);
                break;
            
       }

    }
}