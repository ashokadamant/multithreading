package com.ak.multithreading1;

public class Test_SingleThreadModelApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PrintNumbers pn= new PrintNumbers();
     //  pn.print1to50();
		Mythread2 mt2= new Mythread2(pn);
		 Mythread3 mt3= new Mythread3(pn);
       long time1=System.currentTimeMillis();
		mt2.start();
		mt3.start();
		/*
		 * here two differnet methods of class  executed by two  different threads parallely.
		 * one thread for one method and another thread for another method.
		 * 
		 */
       long time2= System.currentTimeMillis();
       System.out.println("the total time taken for executing"+(time2-time1)+"ms");
	}

}
