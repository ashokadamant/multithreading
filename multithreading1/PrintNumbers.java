package com.ak.multithreading1;

public class PrintNumbers {
    
	public void print1to50() {
		for(int i=1;i<=50;i++) {
			if(i%8==0) {
				System.out.println(i+"\n");
			}
			else {
			System.out.print(i+"\t");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void print50to1() {
		for(int i=50;i>=1;i--) {
			if(i%8==0) {
			System.out.println(i+"\n");
			}
			else {
			System.out.print(i+"\t");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
