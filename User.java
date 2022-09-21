package com.egiftcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	

	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "userid")
	    private int userId;
	    @Column(name = "first_name")
	    private String firstName;
	    @Column(name = "last_name")
	    private String lastName;
	    private String email;
	    private int mobile;
	    private String password;
	    private String address;
	    public int getUserId() {
	        return userId;
	    }
	    public void setUserId(int userId) {
	        this.userId = userId;
	    }
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public long getMobile() {
	        return mobile;
	    }
	    public void setMobile(int mobile) {
	        this.mobile = mobile;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    @Override
	    public String toString() {
	        return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
	                + ", mobile=" + mobile + ", password=" + password + ", address=" + address + "]";
	    }
		public User(int userId, String firstName, String lastName, String email, int mobile, String password,
				String address) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobile = mobile;
			this.password = password;
			this.address = address;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

	 
     
	    
	    
	}
	 

