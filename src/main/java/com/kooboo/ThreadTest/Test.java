package com.kooboo.ThreadTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Thread thread = new MyThread();
//		thread.start();
//		Thread thread1 = new Thread(new MyRunnable());
//		thread1.start();
//
//		System.out.println("mainœﬂ≥Ã");
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + ",running");
				}
			}.start();
		}
		System.out.println("test");
	}

}
