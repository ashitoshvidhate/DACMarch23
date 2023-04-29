import java.util.Date;
import java.io.*;
import java.text.*;

class Program{
    public static void main(String args[]) throws ParseException{
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat( pattern);
        String source = "23/07/1983";
        Date date = sdf.parse( source );
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        System.out.println(day+" / "+month+" / "+year);
 }
}