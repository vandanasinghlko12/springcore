package com.spring.springcore1.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/springcore1/collection/config1.xml");
	
  Employee emp	= (Employee) context.getBean("employee");
  
     System.out.println(emp);
     System.out.println( emp.getName());
     System.out.println(emp.getPhone());
     System.out.println(emp.getAddress());
     System.out.println(emp.getCourses());
	} 

}
 