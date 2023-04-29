package com.org.userregister;

import com.org.filghtregister.Flight;

public class UserData {
	private int index;
	private int capacity;

	private User[] arr;

	public UserData(int capacity) {
		this.arr = new User[capacity];
	}

	public void addNewUser(User u1) {
		if (index < this.arr.length) {
			this.arr[index] = u1;
			index = index + 1;
		}
	}

	public User findUser(int userid) {
		for (User u : this.arr) {
			if (u.getUserid() == userid) {
				return u;
			}
		}
		return null;
	}
	
	public boolean removeUser(int userid) {
		for(index=0;index<arr.length;index++) {
			if((this.arr[index]!=null)&&(this.arr[index].getUserid()==userid)){
				this.arr[index]=null;
				return true;
			}
		}
		return false;
	}
	
	public void printAllUser() {
		for(User u:this.arr) {
			System.out.println(u);
		}
	}
	

}
