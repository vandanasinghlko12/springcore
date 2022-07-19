package com.spring.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractApplicationContext	context= new ClassPathXmlApplicationContext("com/spring/lifeCycle/samosaconfig.xml");
	  Samosa s= (Samosa) context.getBean("samosa");
	  System.out.println(s);
	  context.registerShutdownHook();
	  
     Pepsi p	= (Pepsi) context.getBean("pepsi");
     System.out.println(p);
     
     System.out.println("++++++++++++++++");
   Subject ss  =(Subject) context.getBean("subject");
      System.out.println(ss);
      
      
	}

}
