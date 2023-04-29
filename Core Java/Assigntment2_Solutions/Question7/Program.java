import java.util.*;
import java.io.*;

class TollBoothBill{
    String vehicle;
    int number_of_axes;
    double distance;

    double distnace_travelled;
    double toll_fee;

    TollBoothBill(){

    }

     public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public int getNumber_of_axes() {
		return number_of_axes;
	}

	public void setNumber_of_axes(int number_of_axes) {
		this.number_of_axes = number_of_axes;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDistnace_travelled() {
		return distnace_travelled;
	}

	public void setDistnace_travelled(double distnace_travelled) {
		this.distnace_travelled = distnace_travelled;
	}

	public double getToll_fee() {
		return toll_fee;
	}

	public void setToll_fee(double toll_fee) {
		this.toll_fee = toll_fee;
	}

    public void calculateTollFee(String vehicle,int axes){
        
        if((vehicle.equals("vans")) || (vehicle.equals("car")) || (vehicle.equals("buses"))){
        
            double toll=axes*0.25;
            System.out.println("Total Toll Fee="+toll);
        }
        else if(vehicle=="trucks"){
            double toll=axes*0.50;
            System.out.println("Total Toll Fee="+toll);
        }
       // System.out.println("Total Fee = "+toll);
    }

    public void generateBill(double tollf,double due){
        double finalbill=tollf+due+2;
        System.out.println("Total final Bill ="+finalbill);
    }
    
}

class TollBoothBillTest{
    TollBoothBill tb = new TollBoothBill();
    static Scanner sc=new Scanner(System.in);

    public static char MenuList(){

        System.out.println("a.Enter vehicle type(car,bus,van or truck)");
        System.out.println("b.Enter number of axles");
        System.out.println("c.Enter distance travelled");
        System.out.println("d.Calculate toll fee");
        System.out.println("e.Generate Bill");
        System.out.println("0.Exit");

        return sc.next().charAt(0);
        
    } 
}

class Program{
    public static void main(String args[]){
        TollBoothBillTest test=new TollBoothBillTest();
        TollBoothBill tb=new TollBoothBill();
        Scanner sc=new Scanner(System.in);

        char choice;
       
        while( ( choice = TollBoothBillTest.MenuList( ) ) != 0 ){
            switch(choice){
                case 'a':
                    System.out.println("Enter vehicle type:");
                    //sc.nextLine();
                    tb.setVehicle(sc.nextLine());
                    break;
                case 'b':
                    tb.setNumber_of_axes(sc.nextInt());
                    break;
                case 'c':
                    tb.setDistnace_travelled(sc.nextDouble());
                    break;
                case 'd':
                   //String v=tb.getVehicle();
                   //System.out.println(v);
                   // int noaxes=tb.getNumber_of_axes();
                    //System.out.println(noaxes);
                    tb.calculateTollFee(tb.getVehicle(),tb.getNumber_of_axes());
                    break;
                case 'f':
                    System.out.println("")
                    break;
            }
        }
    }
}