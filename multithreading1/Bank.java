package com.ak.multithreading1;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount acc1=new BankAccount("ashok",1242l,10000);
      BankAccount acc2= new BankAccount("vamsi",32422l,20000);
      BankAccount acc3= new BankAccount("ravi",242424l,30000);
      dpthread dt= new dpthread(acc1,2300);
      dt.start();
      System.out.println("main");
      wthread wt= new wthread(acc2,2400);
      System.out.println("Bank.main()");
      wt.start();
      
     
	}

}
