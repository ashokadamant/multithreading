package com.ak.threadstates;

public class Test03_threadalive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Mythread1 mt= new Mythread1();
        
        System.out.println("after thread object creation"+mt.getState()+mt.isAlive());
        mt.start();
        System.out.println("after start call in main"+mt.getState()+" "+mt.isAlive());
        Thread.sleep(1000);
        System.out.println(mt.getState()+" "+mt.isAlive());
        Thread.sleep(1000);
        System.out.println(mt.getState()+" end"+mt.isAlive()+" "+ mt.getName()+" "+mt.getPriority());
	}

}
