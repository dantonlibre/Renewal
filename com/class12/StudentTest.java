package com.class12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentTest {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy + MM + dd + HH ");
		int s = Integer.parseInt("2021");
		System.out.println("Current Date: " + ft.format(date));

		Student john = new Student();
		john.setName("John");
		john.setSurname("Jonson");
		john.setYear(2017);
		
		Student jack = new Student();
		jack.setName("Jack");
		jack.setSurname("Killer");
		jack.setYear(2016);
		
		Student jerry = new Student();
		jerry.setName("Jerry");
		jerry.setSurname("Gitz");
		jerry.setYear(2019);
		
		//Student[] students = new Student[3];
		Student[] students = {john, jack, jerry};
//		System.out.println(jerry.getFullName() + " " + "Course = " + jerry.getCourse());
		
		
		
		University un = new University();
		un.add(jack);
		un.add(jerry);
		un.add(john);
		un.add(jerry);
		un.add(john);
		
		un.prinAll();
		
	}

}
