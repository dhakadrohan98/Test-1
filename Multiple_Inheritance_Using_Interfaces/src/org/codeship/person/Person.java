package org.codeship.person;

public abstract class Person implements isAlive,LiveLife {
	public void speak() {
		System.out.println("share his/her thoughts");
	}
	
	@Override
	public void breathe() {
		System.out.println("be alive; remain living.");
	}
	
	@Override
	public void message() {
		System.out.println("Life is journey, keep moving with joyfull");
	}
	
	public abstract void eat();
}
