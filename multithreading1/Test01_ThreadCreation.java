 package com.ak.multithreading1;

public class Test01_ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mythread mt= new Mythread();
    
      Mythread mt1= new Mythread();
      mt1.start();
      mt.start();
	}

}
class Mythread extends Thread{
	/*
	 * in both threads same logic is running parlllely.with corresponding thread object.
	 * here threads are differnet but both are executing same logic.
	 */
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" my");
		}
	}
}
