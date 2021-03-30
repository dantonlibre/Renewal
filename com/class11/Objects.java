package com.class11;

public class Objects {

	public static void main(String[] args) {

		Ticket ticket = new Ticket();
		ticket.setNumber(170);

		StudentTicket faculty = new StudentTicket();
		faculty.setFaculty("Dental");
		faculty.setNumber(300);
		ticket.print();
		faculty.print();
//		System.out.println(faculty.getFaculty() + " = " + faculty.getNumber());
//
//		System.out.println(ticket.getNumber());
	}

}

class Ticket {

	private int number;

	public void setNumber(int number) {
		this.number = number;

	}

	public int getNumber() {
		return number;

	}

	public void print() {

		System.out.println("number = " + number);
	}
}

class StudentTicket extends Ticket {

	private String faculty;

    @Override
	public void print() {
		// TODO Auto-generated method stub
    	super.print();
    	System.out.println("faculty = " + faculty);		
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;

	}

	public String getFaculty() {
		return faculty;
	}
	

}