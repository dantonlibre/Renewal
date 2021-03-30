package com.class10;

public class Person {

//	Создать класс Person, который содержит: 
//		a) поля fullName, age. 
//		б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит". 
//		в) Добавьте два конструктора  - Person() и Person(fullName, age).
//		Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

	private String fullName;
	private int age;

	Person() {

	}

	Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;

		if (age < 18) {
			System.out.println(fullName + " Don't sell alcohol");
		} else {
			System.out.println(fullName + " You welcome to bay");
		}
	}

	public void setFullName(String fullName) {
		if(fullName==null) {
			System.out.println("No name add");
			return;
		}
		if (fullName.length() < 3) {
          System.out.println("wrong name");
		}else {
			this.fullName = fullName;
		}
	}
	public String getFullName() {
		return fullName;
	}
	public void setAge(int age) {
		this.age = age;
		if (age < 18) {
			System.out.println(fullName + " Don't sell alcohol");
		} else {
			System.out.println(fullName + " You welcome to bay");
		}
	}
	public int getAge() {
		return age;
	}

	void move() {
		System.out.println(fullName + " Coming to me ");

	}

	void talk() {
		System.out.println(fullName + " Tolking  to you ");
	}

}
