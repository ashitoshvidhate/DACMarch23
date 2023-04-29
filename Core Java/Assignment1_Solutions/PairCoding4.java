import java.util.*;
import java.io.*;

class PairCoding4{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		float ts;
		float mps,kph, mph;

		System.out.print("Input distance in meters: ");
		float distance = sc.nextFloat();

		System.out.print("Input hour: ");
		float hr = sc.nextFloat();

		System.out.print("Input minutes: ");
		float min = sc.nextFloat();

		System.out.print("Input seconds: ");
		float sec = sc.nextFloat();

		ts = (hr*3600) + (min*60) + sec;
		mps = distance / ts;
		kph = ( distance/1000.0f ) / ( ts/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Speed in m/s is "+mps);
		System.out.println("Speed in km/h is "+kph);
		System.out.println("Speed in miles/h is "+mph);
		

	}

}