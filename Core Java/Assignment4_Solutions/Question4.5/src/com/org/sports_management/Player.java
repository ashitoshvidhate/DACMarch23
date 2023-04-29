package com.org.sports_management;

public class Player {
	private String name;
	private int age;
	private String team;
	private int score;
	private String gamename;
	
	public Player() {
	}
	public Player(String name, int age, String team, int score) {
		this.name = name;
		this.age = age;
		this.team = team;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
	public void play() {
		
		System.out.println("Playing Game ="+this.gamename);
		System.out.println("Player score of "+this.name+" = "+this.score);
		
		
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", team=" + team + ", score=" + score + ", gamename="
				+ gamename + "]";
	}
	
	
}
