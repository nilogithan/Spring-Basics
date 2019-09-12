package com.sgic.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee)ctx.getBean("emp");
		
		System.out.println("Employee id: "+employee.getId());
		System.out.println("Employee Name: "+employee.getName());
		
		Employee employee1 = (Employee)ctx.getBean("emp1");
		
		System.out.println("Employee id: "+employee1.getId());
		System.out.println("Employee Name: "+employee1.getName());
	}

}
