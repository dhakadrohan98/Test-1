package org.codeship;

public class App {
	
	public static int counter=0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					App.counter++;
				}
				System.out.println("The loop in thread1 is over");
			}
		
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					App.counter++;
				}
				System.out.println("The loop in thread2 is over");
			}
		
		});
		thread1.start();
		thread2.start();
		Thread.sleep(1000);
		System.out.println("The value of counter is " + App.counter);

	}

}
