import java.util.*;
import java.io.*;

class BankAccount{
    String accName;
    int accNumber;
    double accBalance;

    BankAccount(){

    }
    BankAccount(String accName,int accNumber,double accBalance){
        this.accName=accName;
        this.accNumber=accNumber;
        this.accBalance=accBalance;
    }

    public void setAccName(String accName){
        this.accName=accName;
    }
    public String getAccName(){
        return this.accName;
    }
    public void setAccNumber(int accNumber){
        this.accNumber=accNumber;
    }
    public int getAccNumber(){
        return this.accNumber;
    }

    public void setAccBalance(double accBalance){
        this.accBalance=accBalance;
    }
    public double getAccBalance(){
        return this.accBalance;
    }

    public void deposit(double amount){
        this.accBalance=this.accBalance+amount;
        System.out.println("Balance after deposit = "+this.accBalance);
    }

    public void withdrawl(double amount){
        if(this.accBalance > 0){
        this.accBalance=this.accBalance-amount;
        System.out.println("Balance after withdrwal = "+this.accBalance);
        }
        else{
            System.out.println("Low balnace...");
        }
    }

    public void displaybalance(){
        System.out.println("Account Balance = "+this.accBalance);
    }
    public void displayAllData(){
        System.out.println("Account Holder Name : "+this.accName);
        System.out.println(" Account Number : "+this.accNumber);
        System.out.println(" Account Balance : "+this.accBalance);
    }
}
class Program{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    BankAccount ba = new BankAccount();
    char ch;
    do{
    System.out.println("Please select 1.create new account " +
                        "2.Deposit money"+
                        " 3.Withdraw money"+
                         "4.Account Balance"+
                          "5.Account holder information");
    int choice=sc.nextInt();

    switch(choice){
        case 1:
            System.out.println("Enter Account holder Name :");
            sc.nextLine();
            ba.setAccName(sc.nextLine());
           // System.out.println("Enter Accound Number");
            //System.out.println();
            ba.setAccNumber((int)Math.floor(Math.random()*100000));
          //  System.out.println("Enter Account Balance :");
            ba.setAccBalance(0.0);
            break;
        case 2:
            System.out.println("Enter amount :");
            ba.deposit(sc.nextDouble());
            break;
        case 3:
            System.out.println("Enter amount :");
            ba.withdrawl(sc.nextDouble());
            break;
        case 4:
            ba.displaybalance();
            break;
        case 5:
            ba.displayAllData();
            break;
    }
    System.out.println("Do you want to continue? Please enter Y or Y=yes....");
    ch=sc.next().charAt(0);

    }while(ch=='Y'||ch=='y');

}
}