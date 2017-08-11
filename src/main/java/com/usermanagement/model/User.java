package com.usermanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user_dtls")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String firstName;
    private String lastName;
    private String userName;
	private String password;
	private String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	  public String getFirstName() {
	        return firstName;
	}
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	}
	    
	    public long getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	  
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

   
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     
}