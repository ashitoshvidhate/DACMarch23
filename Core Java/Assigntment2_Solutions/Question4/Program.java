import java.util.*;
import java.io.*;

class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(){

    }
    ElectricityBill(String customerName,double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }

    public void calculateBillAmount(double unit){
       // double billAmount=0;
        if(unit <= 100){
            this.billAmount=unit*5;
        }
        else if(unit > 100 && unit <= 200){
            this.billAmount=100*5+(unit-100)*7;
        }
        else if(unit > 200){
            this.billAmount=100*5+100*7+(unit-200)*10;
        }

        System.out.println("Customer Name :"+this.customerName);
        System.out.println("Units Consumed :"+this.unitsConsumed);
        System.out.println("Total Bill amount :"+this.billAmount);
    }
}
class Program {

    public static void main(String[] args) {
        ElectricityBill eb ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        String name=sc.nextLine();
        System.out.println("Enter Units Consumed :");
        double unit=sc.nextDouble();
        eb=new ElectricityBill(name,unit);
        eb.calculateBillAmount(unit);
    }
}
