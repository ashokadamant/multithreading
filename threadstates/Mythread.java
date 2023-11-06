package com.ak.threadstates;

public class Mythread extends Thread {
  @Override
  public void run() {
	  System.out.println("after start call in run"+this.getState()+" "+this.isAlive());
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("after sleep in run"+this.getState()+" "+this.isAlive());
	  
  }
}
