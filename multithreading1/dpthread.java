package com.ak.multithreading1;

public class dpthread extends Thread {
  private BankAccount acc;
  private int amt;
  dpthread(BankAccount acc, int amt){
	  this.acc=acc;
	  this.amt=amt;
  }
  public void run() {
	  try {
		acc.deposit(amt);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
