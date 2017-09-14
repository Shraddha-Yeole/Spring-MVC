package com.spring.firstprogram.springHelloWorldProgram;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingBeanClass greetings = (GreetingBeanClass) context.getBean("greeter");
		System.out.println(greetings.getGreeting());
	}

}
