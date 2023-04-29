/*
11.Accept character from command line and perform below
operations. Here you can use charAt() method to extract
character:
a. Check whether entered character is letter or digit. If it
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase?
If it is in lowercase then convert it into upper case and
print it well as its code point. If it is in uppercase
then convert it into lower case and print it well as its
code point.

*/

class Program11{

    public static void main(String args[]){

        System.out.println(args[0]);

        String str = args[0];
        char ch =str.charAt(0);

        if(Character.isLetter(ch)){
            if(Character.isLowerCase(ch)){
                char ch1 = Character.toUpperCase(ch);
                System.out.println("Character in LowerCase ="+ch1);
                int codepoint1 =(int)ch1;
                System.out.println("Code Point :"+codepoint1);

            }
            else{
                char ch2 = Character.toLowerCase(ch);
                System.out.println("Character in UpperCase ="+ch2);
                int codepoint2 =(int)ch2;
                System.out.println("Code Point :"+codepoint2);
            }
        }
        else{
            System.out.println("Digit is entered..");
            System.out.println("Character codepoint ="+ch);
        }
    }
}