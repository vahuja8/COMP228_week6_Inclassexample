package com.va.week6.abs2;

public abstract class Subject {
	
	Subject()   // constructor.. 
	{
	      System.out.println("Learning Subject"); 

	}
	
	abstract void syllabus();
	// no defination shall be there -since this is abstract method.. 
	
	
	void Learn() {
        System.out.println("Preparing Right Now!");

	}

}
