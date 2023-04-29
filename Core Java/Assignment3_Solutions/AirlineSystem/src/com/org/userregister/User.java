package com.org.userregister;

public class User {
	int userid;
	String username;
	String useremail;
	long usercontact;
	
	public User() {
	}
	
	public User(int userid,String username, String useremail, long usercontact) {
		this.userid=userid;
		this.username = username;
		this.useremail = useremail;
		this.usercontact = usercontact;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public long getUsercontact() {
		return usercontact;
	}

	public void setUsercontact(long usercontact) {
		this.usercontact = usercontact;
	}
	
	

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return String.format("%-20d-20s%-20s%-20d",this.userid,this.username,this.useremail,this.usercontact);	
	}
	

	
	
}
