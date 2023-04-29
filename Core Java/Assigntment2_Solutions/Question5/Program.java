import java.util.*;
import java.io.*;

class TelephoneBill{
    String customerName;
    long custoemrPhone;
    int customerCallcount;
    double customerCallduration;

    TelephoneBill(){

    }

    public void setcustomerName(String customerName,long custoemrPhone,int customerCallcount,double customerCallduration){
        this.customerName=customerName;
        this.custoemrPhone=custoemrPhone;
        this.customerCallcount=customerCallcount;
        this.customerCallduration=customerCallduration;
    }
    public String getcustomerName(){
        return this.customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    public long getcustomerPhone(){
        return this.custoemrPhone;
    }
    public void setcustomerPhone(long custoemrPhone){
        this.custoemrPhone=custoemrPhone;
    }

    public void setcustomercallcount(int customerCallcount){
        this.customerCallcount=customerCallcount;
    }
    public int getcustomercallCount(){
        return this.customerCallcount;
    }

    public void setCustomerCallduration(double customerCallduration){
        this.customerCallduration=customerCallduration;
    }
    public double getCustomerCallduration(){
        return this.customerCallduration;
    }

    public double calBill(int customerCallcount,double customerCallduration){
        double flaterate = 10;
        double cost=0;
        long callduration = Math.round(customerCallduration);
        //System.out.println(callduration);

        if((customerCallcount <= 100) &&  callduration >= 1){

            cost=(customerCallcount*0.50)+flaterate;
        }
        else if((customerCallcount > 100) && callduration >= 1){
            cost = (customerCallcount*0.25)+flaterate;
        }
       

        return cost;
    }
}

class Program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TelephoneBill tb=new TelephoneBill();
        System.out.println("Enter customerName :");
        tb.setcustomerName(sc.nextLine());
        System.out.println("Enter customerPhone :");
        tb.setcustomerPhone(sc.nextLong());
        System.out.println("Enter customer call count :");
        tb.setcustomercallcount(sc.nextInt());
        System.out.println("Enter customer call duartion:");
        tb.setCustomerCallduration(sc.nextDouble());

        double ans=tb.calBill(tb.getcustomercallCount(),tb.getCustomerCallduration());

        System.out.println("Bill = "+ans);
    }
}