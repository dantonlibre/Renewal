package com.class12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends User {

	private int year;

//	Реализуйте класс Student (Студент), который будет наследовать от класса User, подобно тому, как это сделано в теоретической части урока. 
//	Этот класс должен иметь следующие свойства: name (имя, наследуется от User), surname (фамилия, наследуется от User), year (год поступления в вуз).
//	Класс должен иметь метод getFullName() (наследуется от User), с помощью которого можно вывести одновременно имя и фамилию студента.
//	Также класс должен иметь метод getCourse(), который будет выводить текущий курс студента (от 1 до 5). 
//	Курс вычисляется так: нужно от текущего года отнять год поступления в вуз. Текущий год получите самостоятельно.

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String getFullName() {
		return getName() + " " + getSurname();
	}

	public int getCourse() {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy");
		return  Integer.parseInt(ft.format(date)) - year; //"2021"-5
	}

}

class User {
	private String name, surname;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}
}

class University{
	
	private Student[] students = new Student[10];
	private int len =0;
	
	public void add(Student student ) {
		students[len]=student;
		len++;
	}
	
	public void prinAll() {
		for(int i = 0; i<len;i++) {
			System.out.println(students[i].getFullName() + " " + " Course = " + students[i].getCourse());
		}
		
	}
}










