package com.ak.settingnames;

public class Mythread extends Thread {
   Mythread(){
	   super();
   }
   Mythread(String name){
	   super(name);
   }
   public void run() {
	   for( int i=0;i<10;i++) {
		   System.out.println("run "+i);
	   }
   }
}
