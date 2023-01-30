package org.codeship;

class Brackets{
	private Object lock = "lock";
	
	public void generate() {
		synchronized(lock) {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
		}
		
		for(int j=0; j<=10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/* 
 * Sychronized method approach
 * Time Required: 5700 ms
 * 
 * Sychronized block approach
 * Time Required: 3900 ms
 * */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brackets bracket = new Brackets();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime1 = System.currentTimeMillis();
				for(int i=1; i<=5; i++) {
					bracket.generate();
				}
				long endTime1 = System.currentTimeMillis();
				System.out.println("Execution time for 1st Thread- " + (endTime1-startTime1));
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime2 = System.currentTimeMillis();
				for(int i=1; i<=5; i++) {
					bracket.generate();
				}
				long endTime2 = System.currentTimeMillis();
				System.out.println("Execution time for 2nd Thread- " + (endTime2-startTime2));
			}
		}).start();

	}

}
