package com.ak.threadstates;

public class Mythread1 extends Thread {
    public void run() {
    	System.out.println("after start call in run"
    +this.getState()+this.isAlive());
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(this.getState()+"   "+this.isAlive());
    }
}
