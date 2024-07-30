package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="peoplebank")
public class Peoplesbank {
	@Id
private long accountno;
private String name;
private String password;
private double amount;
private long mobileno;
public Peoplesbank() {
	super();
	// TODO Auto-generated constructor stub
}
public Peoplesbank(long accountno, String name, String password, double amount, long mobileno) {
	super();
	this.accountno = accountno;
	this.name = name;
	this.password = password;
	this.amount = amount;
	this.mobileno = mobileno;
}
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "Peoplesbank [accountno=" + accountno + ", name=" + name + ", password=" + password + ", amount=" + amount
			+ ", mobileno=" + mobileno + "]";
}

}
