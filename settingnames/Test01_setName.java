package com.ak.settingnames;

public class Test01_setName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mythread mt1= new Mythread();
      System.out.println(mt1.getName());
      System.out.println();
      mt1.setName("child1");
      /*
       * we can set names to the thread by two ways 1)by passing name to 
       * the constructor 2)by setname method of the thread class.
       * if we pass by constructor then child thread should have a constructor 
       * which takes argument as string then internally it passes the string name
       * to the thread class string param construcor and stores in the name variable 
       * of the Thread class.
       */
      System.out.println(mt1.getName());
      Mythread mt2=new Mythread("child2");
      System.out.println(mt2.getName());
      /*
we can set name and priority of the thread immediatly after the thread
object creattion. we can change the name and priorityof the at anytime
i.e at new, ready to run state and running state and waiting state and 
dead state also. but after dead state 
after dead state also we get priorityand set we canset priority but no use because
thread is already dead.
       */
	}

}
