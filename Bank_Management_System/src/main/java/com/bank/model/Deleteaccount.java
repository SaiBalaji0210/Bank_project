package com.bank.model;

public class Deleteaccount {
	private long accountno;
	private String name;
	private String password;
	private String confirmpassword;
	public Deleteaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deleteaccount(long accountno, String name, String password, String confirmpassword) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
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
	@Override
	public String toString() {
		return "Deleteaccount [accountno=" + accountno + ", name=" + name + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	

}
