package com.org.sports_management;

public class FootballPlayer extends Player{
	private int goalsScored;
	private int assists;
	
	
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public FootballPlayer() {
		
		
	}
	public FootballPlayer(String name, int age, String team, int score,int goalsScored,int assists) {
		super(name, age, team, score);
		// TODO Auto-generated constructor stub
		this.goalsScored=goalsScored;
		this.assists=assists;
	}
	
	public void play() {
		System.out.println("Football match started....");
		if(this.assists >0) {
			this.goalsScored=this.goalsScored+this.assists*5;
			this.setScore(this.goalsScored);
			System.out.println("Goals Scored ="+this.goalsScored);
			System.out.println("Number of Assists ="+this.assists);
		}else {
			this.setScore(this.goalsScored);
		System.out.println("Goals Scored ="+this.goalsScored);
		System.out.println("Number of Assists ="+this.assists);
		}
	}
	

}
