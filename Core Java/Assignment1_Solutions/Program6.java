class Program6{

    public static void main(String args[]){
         //6.1 converting boolean value into String
        
        boolean b = true;

        String str1 = Boolean.toString(b);
//String str1 = Boolean.valueOf(b); Program6.java:9: error: incompatible types: Boolean cannot be converted to String
        System.out.println("String 1 ="+str1);

        //6.2 converting boolean value into Boolean Instance
        Boolean binstan = Boolean.valueOf(b);

        System.out.println("Boolean Instance ="+binstan);

        //6.3 String value into boolean value

        String str2 = "Ashitosh";
        boolean strName = Boolean.parseBoolean(str2);

        System.out.println("strName ="+strName);

        //6.4 String value into Boolean instance

        Boolean boolinst = Boolean.valueOf(str2);
        System.out.println("boolinst ="+boolinst);

    }
}