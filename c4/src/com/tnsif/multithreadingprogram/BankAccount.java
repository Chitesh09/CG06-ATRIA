package com.tnsif.multithreadingprogram;

public class BankAccount {
	int balance=1000;
	
	synchronized void withdraw (int amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+"Starting processing");
			
		}
	}

}
