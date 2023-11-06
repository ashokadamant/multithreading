package com.ak.multithreading1;

public class Test03_DifferentMethodsExecutionWithDifferentThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Addthread at= new Addthread(10);
           at.start();
           Addthread at1= new Addthread(20);
           at1.start();
           Subthread st= new Subthread(10);
           st.start();
           Subthread st1= new Subthread(20);
           st1.start();
	}

}
class Addthread extends Thread{
	private int x;
	Addthread(int x){
		this.x=x;
	}
	public void run() {
		int sum=0;
		for(int i=0;i<=x;i++) {
			sum=sum+i;
			System.out.println(sum+"arun");
		}
	}
}
class Subthread extends Thread{
	private int x;
	Subthread(int x){
		this.x=x;
	}
	public void run() {
		int diff=0;
		for(int i=0;i<=x;i++) {
			diff=diff-i;
			System.out.println(diff+"srun");
		}
	}
}
