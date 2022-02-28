package com.autowirepack.bean;

public class Account {
private int accNo;
private String accName;
private float balance;

public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

public String toString()
{
	return "Account Info :\nAccount Number : " + getAccNo() + "\nAccount Name : " + getAccName() + "\nBalance : " + getBalance();
}

}
