package org.tnsindia.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		//creating the object
		/*Airtel a=new Airtel();
		a.calling();
		a.data();
		
		//creating the object
		Jio j=new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
System.out.println("Config...loaded");
		
		
		
		
	}

}
