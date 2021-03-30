package com.class12;

public class UserUsTest {

	public static void main(String[] args) {
		int sum = 0;
//		Создайте объект этого класса 'Иван', 
//		возраст 25, зарплата 1000. Создайте второй объект этого класса 'Вася',
		// возраст 26,зарплата 2000. Найдите сумму зарплата Ивана и Васи.
		Worker us = new Worker();
		us.setName("Ann");
		us.setAge(25);
		us.setSalary(1000);
		
		// System.out.println(us.getSalary());// 1000

		Worker ivan = new Worker();
		ivan.setName("Ivan");
		ivan.setAge(20);
		ivan.setSalary(1500);
         
		Worker vasya = new Worker();
		vasya.setName("Vasya");
		vasya.setAge(35);
		vasya.setSalary(2000);

		UserUs user = new UserUs();
		user.setName("Valera");
		
		Driver driver = new Driver();
		driver.experience  =5;
		driver.setName("Grisha");	
		driver.setAge(30);
		driver.setExperience(12);
        driver.setCategory("A");
        driver.setSalary(1000);
		
        Driver driver1 = new Driver();
        driver1.setName("Andrei");
        driver1.setAge(40);
        driver1.setExperience(15);
        driver1.setCategory("B");
        driver1.setSalary(2500);
        
        Driver driver2 = new Driver();
        driver2.setName("Lena");
        driver2.setAge(50);
        driver2.setExperience(20);
        driver2.setCategory("C");
        driver2.setSalary(3000);
        
        Driver[]drivers = {driver, driver1, driver2};
             for(int i = 0;i<drivers.length;i++) {
                 
        System.out.println("driver name = " + drivers[i].getName() + " driver category = " + drivers[i].getCategory() + " driver expirience = " + drivers[i].getExperience());
             }
		System.out.println();
		
//		sum = ivan.getSalary() + vasya.getSalary() + us.getSalary();
		UserUs[] workers = { vasya, ivan, us, user, driver, driver1, driver2};
//		System.out.println(
//				"name = " + us.getName() + " " + " age = " + us.getAge() +
//				" salary = " + " " + us.getSalary() + 
//		" " + " The sum salary of 3 workers is = " + sum );
		for (int i = 0; i < workers.length; i++) {
			if (workers[i] instanceof Worker) {
				sum = sum + ((Worker) workers[i]).getSalary();
			}

			System.out.println(workers[i].getName() + " " + workers[i].getIndex());
		}
		System.out.println(" The sum of workers salary = " + sum);
	}

}
