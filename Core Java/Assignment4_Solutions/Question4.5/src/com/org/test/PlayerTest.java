package com.org.test;

import java.util.Scanner;

import com.org.sports_management.CricketPlayer;
import com.org.sports_management.FootballPlayer;
import com.org.sports_management.Player;

public class PlayerTest {

	private static Scanner sc = new Scanner(System.in);

	private Player arr[] = new Player[2];

	public PlayerTest() {
		arr[0] = new CricketPlayer();
		arr[1] = new FootballPlayer();
	}

	public void acceptRecord() {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter Name :");
			sc.nextLine();
			this.arr[index].setName(sc.nextLine());
			System.out.println("Enter age :");
			this.arr[index].setAge(sc.nextInt());
			System.out.println("Enter Team Name :");
			sc.nextLine();
			this.arr[index].setTeam(sc.nextLine());
			System.out.println("Enter score :");
			this.arr[index].setScore(sc.nextInt());

			if (this.arr[index] instanceof CricketPlayer) {
				CricketPlayer cplayer = (CricketPlayer) arr[index];
				System.out.println("Enter Runs scored :");
				cplayer.setRunscored(sc.nextInt());
				System.out.println("Enter Wickets taken :");
				cplayer.setWicketstaken(sc.nextInt());
				cplayer.play();

			} else if (this.arr[index] instanceof FootballPlayer) {
				FootballPlayer fplayer = (FootballPlayer) arr[index];
				System.out.println("Enter goals scored :");
				fplayer.setGoalsScored(sc.nextInt());
				System.out.println("Enter number of assists :");
				fplayer.setAssists(sc.nextInt());
				fplayer.play();
			}
		}
	}

	public static int MenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Player Record");
		System.out.println("2.Print Player Record");
		System.out.println("Enter your choice :");
		return sc.nextInt();
	}

	public void printRecord() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Total Score of =" + arr[i].getClass().getSimpleName() + " = " + arr[i].getScore());
		}
	}
}
