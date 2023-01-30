package org.codeship;

class Brackets{
	
	synchronized public void generate() {
		for(int i=1; i<=10; i++) {
			if(i<=5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
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
				for(int i=1; i<=5; i++) {
					bracket.generate();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					bracket.generate();
				}
			}
		}).start();

	}

}
