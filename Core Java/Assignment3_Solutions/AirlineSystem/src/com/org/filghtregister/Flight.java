package com.org.filghtregister;

public class Flight {
	int flightid;
	String flightname;
	int availableseats;
	
	public Flight() {
	}

	
	public int getFlightid() {
		return flightid;
	}


	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}


	public Flight(int flightid,String flightname, int availableseats) {
		this.flightid=flightid;
		this.flightname = flightname;
		this.availableseats = availableseats;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public int getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}

	@Override
	public String toString() {
		return String.format("%-20d%-20s%-20d",this.flightid, this.flightname,this.availableseats);
	}
	
	
	

}
