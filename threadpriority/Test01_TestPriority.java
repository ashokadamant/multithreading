package com.ak.threadpriority;

public class Test01_TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mythread mt= new Mythread();
       Mythread mt1= new Mythread();
       System.out.println(mt.getName());
       mt.setName("ashok");
       System.out.println(mt.getName());
       System.out.println(mt1.getName());
       System.out.println(mt.getPriority());
       System.out.println(mt1.getPriority());
       mt.setPriority(7);
       // if we give priority more than 10 and  less than 0 then we get
       //illegal thread state exception.
       /*
        * jvm identifies the threads not by name . jvm identifies 
        * threads by id not by name. we keep names to the threads for
        * programmer convenience. we can keep same name to the two threads.
        */
       mt1.setPriority(9);
       mt.start();
       mt1.start();
       
       
	}

}
