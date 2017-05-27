package com.vianet21.entity;

public class RunnableTicket {


	public static void main(String[] args) {
		MyThread  mt= new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}
