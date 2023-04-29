import java.util.*;
import java.io.*;

class Vehicle{
    String vehicle_type;
    int numberoftaxes;
    double distance;
    double tollfee;

    Vehicle(){

    }
    public void setVehicalType(String vehicle_type){
        this.vehicle_type=vehicle_type;
    }
    public String getVehicalType(){
        return this.vehicle_type;
    }
    public void setNumberofaxes(int numberoftaxes){
        this.numberoftaxes=numberoftaxes;
    }
    public int getNumberofaxes(){
        return this.numberoftaxes;
    }
    public double getDistance(){
        return this.distance;
    }
    public void setDistance(double distance){
        this.distance=distance;
    }
    public double caltollfee(String v,int axe){
        if((v.equals("vans")) || (v.equals("car")) || (v.equals("buses"))){
            System.out.println(v);
        }
        else{
            System.out.println("Wrong i/p");
        }
        return 0;
    }
}

class Program{
    public static void main(String args[]){
        Vehicle v1=new Vehicle();
        v1.caltollfee("buses",10);
    }
}