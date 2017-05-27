package com.vianet21.entity;

public class MyThread implements Runnable{

	private int ticket =10;
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
			for (int i = 0; i < 20; i++) {
				if (this.ticket>0) {
					System.err.println("卖票：tichet"+ticket--);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}

	}

	
}
