package com.sgic.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.springcore.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
		Hospital hospital = (Hospital)ctx.getBean("Hospital");
		
		System.out.println("Hospital name: "+hospital.getName());
		System.out.println("Hospital Departments: "+hospital.getDepartments());
		System.out.println("Hospital Class Name: "+hospital.getDepartments().getClass());
		
	}

}
