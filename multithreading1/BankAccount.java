package com.ak.multithreading1;

public class BankAccount {
   public static  String bankname;
   public String accHname;
   public long accNo;
   public int balance;
   static {
	   bankname="sbi";
   }
   BankAccount(String accHname, long accNo, int balance){
	   this.accHname=accHname;
	   this.accNo=accNo;
	   this.balance=balance;
   }
   
   public void deposit(int amt) throws InterruptedException {
	   Thread.sleep(100);
	   balance =balance+amt;
	   System.out.println(balance);
   }
   public void withdraw(int amt) {
	   balance=balance-amt;
	   System.out.println(balance);
   }
   
   
}
