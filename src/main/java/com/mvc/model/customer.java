package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class customer {
	@Id
	private String customerId;
	private String password;
	
	private int balance;
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(String customerId, String password, int balance) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.balance = balance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", password=" + password + ", balance=" + balance + "]";
	}

	
	
}
