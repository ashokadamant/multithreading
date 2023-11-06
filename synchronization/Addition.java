package com.ak.synchronization;

public class Addition {
    private int x;
    private int y;
    public synchronized void add(int x, int y) {
    	this.x=x;
    	this.y=y;
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("IE raised");
		}
    	int res=this.x+this.y;
    	
    	System.out.println(Thread.currentThread().getName()+" res " + res);
    }
}
class Mythread1 extends Thread{
	Addition add;
	Mythread1(Addition add){
		this.add=add;
	}
	public void run() {
		add.add(50,60);
	}
	
}
class Mythread2 extends Thread{
	Addition add;
	Mythread2(Addition add){
		this.add=add;
	}
	public void run() {
		add.add(70,80);
	}
}

