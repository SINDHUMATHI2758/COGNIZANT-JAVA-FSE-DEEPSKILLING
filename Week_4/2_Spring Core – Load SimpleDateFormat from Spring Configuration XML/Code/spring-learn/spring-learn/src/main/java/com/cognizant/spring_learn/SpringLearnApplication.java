package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

	public static void displayDate() {
		// Load Spring context from XML
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

		// Get the SimpleDateFormat bean
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		// Parse string to Date
		String dateStr = "31/12/2018";
		try {
			Date date = format.parse(dateStr);
			System.out.println("Parsed Date: " + date);
		} catch (ParseException e) {
			System.out.println("Error parsing date: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Call the method
		displayDate();
	}
}
