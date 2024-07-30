package com.bank.model;

public class Newaccount {
	private long accountno;
	private String name;
	private String password;
	private String confirmpassword;
	private double amount;
	private long mobileno;
	public Newaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Newaccount(long accountno, String name, String password, String confirmpassword, double amount,
			long mobileno) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
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
		return "Newaccount [accountno=" + accountno + ", name=" + name + ", password=" + password + ", confirmpassword="
				+ confirmpassword + ", amount=" + amount + ", mobileno=" + mobileno + "]";
	}
	
}
