package com.ak.threadstates;

public class Test01_GetState {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Mythread mt= new Mythread();
       System.out.println("after mt object creation in main"+mt.getState());
       if(mt.getState().equals(Thread.State.NEW)){
    	   System.out.println("hi");
       }
       /*
        * here equals method of object class is overrided in java.lang.enum
        * class and every enum by default extends java.lang.enum class 
        * like every class extends object class.
        * for two inputs must be enums not to be strings
        * if we compare enum with string then we get false as the answer.
        */
       else {
    	   System.out.println("hello");
       }
       mt.start();
       System.out.println(mt.isAlive());
       System.out.println("after start() called"+mt.getState());
       Thread.sleep(1000);
       System.out.println("after start call in main"+mt.getState());
      Thread.sleep(1000);
       
      System.out.println(mt.getState()+ " "+mt.isAlive());
      
	}

}
