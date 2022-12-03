package org.tnsindia.springioc;

public class Jio implements Sim{

	public void calling() {
		System.out.println("Calling using Jio");

		
	}

	public void data() {
		System.out.println("Calling using Internet");

		
	}

	public Jio() {
		super();
		System.out.println("Jio Class Constructor");
	}
	

}
