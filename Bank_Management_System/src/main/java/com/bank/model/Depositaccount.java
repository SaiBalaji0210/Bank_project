package com.bank.model;

public class Depositaccount {
	private long accountno;
	private String name;
	private String password;
	private String confirmpassword;
	private double amount;
	public Depositaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Depositaccount(long accountno, String name, String password, String confirmpassword, double amount) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.amount = amount;
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
	@Override
	public String toString() {
		return "Depositaccount [accountno=" + accountno + ", name=" + name + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", amount=" + amount + "]";
	}
	
}
