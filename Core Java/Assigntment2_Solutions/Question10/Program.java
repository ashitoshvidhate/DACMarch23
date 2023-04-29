import java.util.*;
import java.io.*;

class CreditScore{
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;

    int creditscore;

    CreditScore(){

    }
    CreditScore(int creditHistory,double creditUtilization,boolean paymentHistory){
        this.creditHistory=creditHistory;
        this.creditUtilization=creditUtilization;
        this.paymentHistory=paymentHistory;
    }

    public int getCreditHistory() {
		return creditHistory;
	}
	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}
	public double getCreditUtilization() {
		return creditUtilization;
	}
	public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}
	public boolean isPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}

    public int calculateCreditScore(int chistroy,double cutilization,boolean paymenthistory){
        if(paymentHistory==true){
            creditscore=(chistroy*15)+(int)(cutilization*30)+55;
        }
        else{
            creditscore=(chistroy*15)+(int)(cutilization*30)+35;
        }
        return creditscore;
    }


}

class Program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CreditScore cs=new CreditScore();
        System.out.println("Enter credit history :");
        cs.setCreditHistory(sc.nextInt());
        System.out.println("Enter Credit Utilization :");
        cs.setCreditUtilization(sc.nextDouble());
        System.out.println("Enter Payment History :");
        cs.setPaymentHistory(sc.nextBoolean());

        int score = cs.calculateCreditScore(cs.getCreditHistory(),cs.getCreditUtilization(),cs.isPaymentHistory());
        System.out.println("Calculated credit score = "+score);
    }
}
