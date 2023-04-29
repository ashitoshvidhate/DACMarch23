package com.org.sports_management;

public class CricketPlayer extends Player {
	private int runscored;
	private int wicketstaken;

	public int getRunscored() {
		return runscored;
	}

	public void setRunscored(int runscored) {
		this.runscored = runscored;
	}

	public int getWicketstaken() {
		return wicketstaken;
	}

	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	
	
	public CricketPlayer() {
	}

	public CricketPlayer(String name, int age, String team, int score,int runscored,int wicketstaken ) {
		super(name, age, team, score);
		this.runscored=runscored;
		this.wicketstaken=wicketstaken;
		// TODO Auto-generated constructor stub
	}

	public void play() {
		System.out.println("Cricket match starts ...");
		if(this.wicketstaken > 0) {
			this.runscored=this.runscored+(this.wicketstaken*10);
			this.setScore(this.runscored);
			System.out.println("Runs Score ="+this.runscored);
			System.out.println("Wickets taken ="+this.wicketstaken);
		}else {
			this.setScore(this.runscored);
		System.out.println("Runs Score ="+this.runscored);
		System.out.println("Wickets taken ="+this.wicketstaken);
	}

	}
}
