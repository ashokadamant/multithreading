package com.ak.multithreading1;

public class wthread  extends Thread{
  private BankAccount acc;
  private int amt;
  wthread(BankAccount acc,int amt){
	  this.acc=acc;
	  this.amt=amt;
  }
  public void run() {
	  acc.withdraw(amt);
  }
}
