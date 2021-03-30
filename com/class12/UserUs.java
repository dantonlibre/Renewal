package com.class12;

public class UserUs {
//	Сделайте класс User, в котором будут следующие protected поля - name (имя), 
//	age (возраст),
//     public методы setName, getName, setAge, getAge.
	protected String name;
	protected int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getIndex() {
		return 1;
	}

//		Сделайте класс Worker, 
//		который наследует от класса User и вносит дополнительное private поле salary (зарплата), 
//		а также методы public getSalary и setSalary.

}

class Worker extends UserUs {
	private int salary;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public int getIndex() {
		return 2;
		
		
	}}
//		Сделайте класс Driver (Водитель), который будет наследоваться от класса Worker из предыдущей задачи.
//		Этот метод должен вносить следующие private поля: водительский стаж, категория вождения (A, B, C).	

	class Driver extends Worker{
		protected int experience;
		private String category;
		
		public void setExperience(int experience) {
			this.experience = experience;
			
		}
		public int getExperience() {
			return experience;
		}
		
		public void setCategory(String category) {
		this.category = category;
		}
		public String getCategory() {
			return category;
		}	
		public int getIndex() {
			return 3;
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	