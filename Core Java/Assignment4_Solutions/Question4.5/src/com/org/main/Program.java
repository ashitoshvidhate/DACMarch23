package com.org.main;

import com.org.sports_management.Player;
import com.org.test.PlayerTest;

public class Program {
	public static void main(String [] args) {
	int choice;
	PlayerTest test=new PlayerTest();	
	while((choice=PlayerTest.MenuList())!=0) {
		switch(choice) {
		case 1:
			test.acceptRecord();
			break;
		case 2:
			test.printRecord();
			break;
		}
	}
	
}
}

