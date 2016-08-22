package com.will.multithread;

public class Foo {
	public synchronized void test(String name) throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("姓名" + name);
	}
	
	public synchronized void test(int age) throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("年龄" + age);
	}
	
	public void testBlock1() throws InterruptedException{
		synchronized (Foo.class) {
			Thread.sleep(3000);
			System.out.println("testBlock1");
		}
		
	}
	
	public void testBlock2() throws InterruptedException{
		synchronized (this.getClass()) {
			Thread.sleep(3000);
			System.out.println("testBlock2");
		}
	}
}
