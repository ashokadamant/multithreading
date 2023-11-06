 package com.ak.multithreading1;

public class Test02_MethodexecutionWithTwoDifferntThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mythread1 mt= new Mythread1(10);
       mt.start();
       Mythread1 mt1= new Mythread1(15);
       mt1.start();
	}

}
class Mythread1 extends Thread{
	private int x;
	Mythread1(int x){
		this.x=x;
	}
	public void run() {
		for(int i=0;i<=x;i++) {
			System.out.println(i);
		}
	}
	
}
