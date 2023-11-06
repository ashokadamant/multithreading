package com.ak.multithreading1;

public class Mythread3 extends Thread {
	PrintNumbers pn;
	Mythread3(PrintNumbers pn){
		this.pn=pn;
	}
   public void run() {
	   pn.print50to1();
   }
}
