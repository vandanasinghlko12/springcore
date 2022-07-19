package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/spring/ci/configperson.xml");
   Person person1	=(Person) context.getBean("person");
		
		System.out.println(person1);
		
	Addition addi	=(Addition) context.getBean("ad");
	
	addi.doSum();
	}

}
