package com.san;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		//Sim s=new Vodaphone();
		//s.calling();
		//s.data();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//Class Airtel
		Airtel air=(Airtel)context.getBean("a1");
		air.calling();
		air.data();
		
		
		//class VodaPhone
		Vodaphone voda=(Vodaphone)context.getBean("v1");
		voda.calling();
		voda.data();
		
		Vodaphone voda1=context.getBean("v1",Vodaphone.class);
		voda1.calling();
		voda1.data();
		
		//Interface Sim
		Sim s1=context.getBean("s1",Sim.class);
		s1.calling();
		s1.data();
			
		
	}

}
