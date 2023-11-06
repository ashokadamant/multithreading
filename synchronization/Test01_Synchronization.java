package com.ak.synchronization;

public class Test01_Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Addition add= new Addition();
        Mythread1  mt1= new Mythread1(add);
        Mythread2 mt2= new Mythread2(add);
        mt1.start();
        mt2.start();
        Thread.sleep(3000);
        mt1.interrupt();
	}

}
