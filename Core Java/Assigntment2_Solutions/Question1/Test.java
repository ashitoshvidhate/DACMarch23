import java.util.*;
import java.io.*;
import java.text.*;

class Test{
 public static void main(String[] args) {
 Date date = new Date( );
 //SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy");
 //SimpleDateFormat sdf = new SimpleDateFormat( "dd/MMM/yyyy");
 SimpleDateFormat sdf = new SimpleDateFormat( "dd/MMMM/yyyy");
 String strDate = sdf.format(date);
 System.out.println( strDate );
 }
}

