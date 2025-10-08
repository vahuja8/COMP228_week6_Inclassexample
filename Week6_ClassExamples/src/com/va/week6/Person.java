package com.va.week6;

/*
 * Example of polymorphism. 
 * 
 */
/*
 * Polymorphism in Java is one of the core concepts in 
 * object-oriented programming (OOP) that allows objects to behave differently based on their specific class type. The word polymorphism means having many forms, and it comes from the Greek words poly (many) and morph (forms), 
 * this means one entity can take many forms.
 * 
 * 
Multiple Behaviors: The same method can behave differently depending on the object that calls this method.
 
Method Overriding: A child class can redefine a method of its parent class.

Method Overloading: We can define multiple methods with the same name but different parameters.

Runtime Decision: At runtime, Java determines which method to call depending on the object's actual class.
 * 
 * 
 */

public class Person {
	
	void role()
	{
		System.out.println("I am a person.");
	}
	

}
