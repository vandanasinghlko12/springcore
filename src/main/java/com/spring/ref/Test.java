package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/spring/ref/config2.xml");
    A a  =(A) context.getBean("aref");
    System.out.println(a.getX());
    System.out.println(a.getOb());
	}

}
