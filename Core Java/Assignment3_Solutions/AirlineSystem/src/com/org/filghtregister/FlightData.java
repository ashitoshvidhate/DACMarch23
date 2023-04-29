package com.org.filghtregister;

public class FlightData {
	private int index;
	private int capacity;

	private Flight[] farr;

	public FlightData(int capacity) {
		this.farr = new Flight[capacity];
	}

	public void addNeFlight(Flight fl) {
		if(index<this.farr.length) {
			this.farr[index]=fl;
			index=index+1;
		}
	}
	
	public boolean removeFlight(int flightid) {
		for(int index=0;index<farr.length;index++) {
			if(this.farr[index]==flightid) {
				
			}
		}
	}

}
