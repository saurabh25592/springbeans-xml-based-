package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
		User u=context.getBean(User.class,"user");
		u.setId(1);
		u.setName("umesh");
		
		System.out.println(u);
		
		
		User u1=context.getBean(User.class,"user");
		u1.setId(2);
		u1.setName("saurabh");
		u1.display();
		
		System.out.println(u1);
		
	}
	
	
}
