package com.spring.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {

	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Subject [example=" + example + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("hii ");
	}
	@PreDestroy
	public void end() {
		System.out.println("bye");
	}
	
}
