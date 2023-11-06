package com.ak.multithreading1;

public class Mythread2 extends Thread {
	PrintNumbers pn;
	Mythread2(PrintNumbers pn){
		this.pn=pn;
	}
   public void run() {
	   pn.print1to50();
	   
   }
}
