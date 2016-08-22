package com.will.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	public static void main(String[] args) {
		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				try {
					foo1.test("sunwei");
//					foo1.testBlock1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				try {
					foo1.test(18);
//					foo2.testBlock2();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		executor.execute(runnable1);
		executor.execute(runnable2);
	}
}
