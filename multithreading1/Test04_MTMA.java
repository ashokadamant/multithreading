package com.ak.multithreading1;

public class Test04_MTMA extends Thread {
   static PrintNumbers pn=new PrintNumbers();
	public void run() {
		pn.print1to50();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04_MTMA mt= new Test04_MTMA();
		mt.start();
	long time1=System.currentTimeMillis();
      
       pn.print50to1();
	long time2=System.currentTimeMillis();
			System.out.println("the time take for execute"+(time2-time1)/1000);
		
	}

}
