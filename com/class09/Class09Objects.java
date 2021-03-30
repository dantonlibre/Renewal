package com.class09;

public class Class09Objects {
	public static void main(String[] args) {

		Coffe machine = new Coffe();
		machine.water = 1000;
		machine.coffe = 300;
		machine.sugar = 200;
		
		Coffe machine2 = new Coffe();
		machine2.water = 1000;
		machine2.coffe = 300;
		machine2.sugar = 200;
		
//		machine.coock(4);
//		machine.coock(5);
//		machine.coock(1);
//		machine.coock(3);
//		machine.coock(2);
//		machine.coock(7);
//		machine.coock(4);
		
		Man man1 = new Man();
		man1.name = "Mike";
		man1.money = 10;
		
		
		
		
		Man man2 =new Man();
		man2.name = "Den";
		man2.money = 500;
		
		
		
		
		machine.coock(3, man2);
		machine.coock(2, man1);
		
		
		
	}

}

class Coffe {
	int coffe = 0;
	int water = 0;
	int sugar = 0;

	void coock(int sugar, Man man) {
		if(water<100) {
			System.out.println("Empty tray : add water");
			return;
		}
		if (coffe < 50) {
			System.out.println("Empty tray : edd coffe ");
			return;
			
		}
         if(man.money<25) {
        	 System.out.println(man.name + " You don't have anough money");
        	 return;
         }
        	 
        	 
		water = water - 100;
		coffe = coffe - 50;
        this.sugar = this.sugar-sugar;
        man.money = man.money-25; 
        
		// 2-2=0
		// 0=2-2

		System.out.println( man.name + " Your coffe is ready!  " + "sugar = " + sugar + " you have change " + man.money);
		System.out.println("You have " + " water = " + water + " coffe =  " + coffe);
	}
}
   class Man{
	   
	   String name;
	   int money;
  
	   
   }