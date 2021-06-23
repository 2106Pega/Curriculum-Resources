package com.revature;

import com.revature.datastructures.QueueClass;
import com.revature.models.Animal;
import com.revature.models.Athlete;
import com.revature.models.Human;
import com.revature.models.Superhero;

public class MainDriver {
	
	/*
	 * What is OOP?
	 * 
	 * 		Object Oriented Programming, main pillars: 
	 * 			Inhertiance, abstraction, encapsulation, polymorhpism 
	 * 
	 * 		OOP is a language independent concept. 
	 * 		What does the pillars do, why is that beneficial for us, how does a language support it?
	 * 		
	 * 		Inheritance?
	 * 			For example if you have a child class, you can inherit functions from the parent class. 
	 * 			You can inherit more than variables and methods. 
	 * 			Establishes an IS-A relationship 
	 * 			Java does not support multiple inheritance, class can only extend one other class
	 * 			
	 * 			(functions vs method: 
	 * 				method is a function that belongs to an object)
	 * 
	 * 
	 * 			Inheritance allows us to reuse code and incorporate legacy code into our projects. 
	 * 			It does this by allowing us to inherit properties and behaviours between objects, establishing
	 * 			a parent and child relationship. Java achieves inheritance using the extends keyword. 
	 * 
	 * 
	 * 		Polymorphism 
	 * 			Is the way for objects to be represented in different ways 
	 * 			The form an objects during runtime 
	 * 
	 * 		What happens if I change the access modifier or return type for overriden or overloadded methods!
	 * 
	 * 
	 * 			The word itself means to take many different forms. From inheritance we're allowed to reuse code 
	 * 			implemented by parent classes but we're not restricted to that implementation and we can choose to 
	 * 			use those mehtods for differenct actions.
	 * 
	 *  		Java achieves polymorphism in 2 key ways: 
	 * 				Method overloading is a form of polymorphism  (Compile time)
	 * 				Method overriding is also a form of polymorphism. (Runtime) 
	 * 
	 * 		Encapsulation
	 * 			Restricting access to information to a class, to avoid dangerous operations being committed onto it. 
	 * 			
	 * 			Java does it using access modifers: public, protected, (default)/(package), private	
	 * 
	 * 			What does protected to?
	 * 					Gives access to child classes, without full on public. 
	 * 					Gives access to the class itself, to the package it's in as well and child classes that are outside of 
	 * 					the package. 
	 * 
	 * 			(Other languages does not necassarily support the same levels of access)
	 * 
	 * 			
	 * 			Other developers don't change things they're not supposed to. 
	 * 
	 * 
	 * 		Abstraction 
	 * 			A contract for the child class, hide implementation details. 
	 * 			By hiding away implementation detail, we're free to focus on our own business level challenges. 
	 * 			
	 * 			Interfaces allows us to achieve full abstraction. 
	 * 				Interfaces vs classes: 
	 * 					We don't have concrete methods. 
	 * 					We have implicit modifiers on our variables and methods. 
	 * 					We can implemenent and extend multiple interfaces, class cannot. 
	 * 
	 * 			(Partial abstraction)	Abstract classes: 
	 * 					We can define some of the methods but abstract methods can also be defined. 
	 * 					Abstract class doesn't need abstract methods. 
	 * 					Abstract classes provide constructors. 
	 * 			
	 */
	
	public static void main(String[] arguments) {
		
		//reference variables point to memory location 
		//right now, I'm pointing to a Human in (heap) memory 
		
		Human bob = new Human("Bob");
		
		
//		bob.move();
//		bob.jump();
		
		Athlete adam = new Athlete("Adam"); //athlete adam with generic fitness level
		//adam is also a human! and a object! as the child class, it gets access to all its parenets methods*
		
//		adam.move();
//		adam.jump();
//		System.out.println(adam.name);
//		System.out.println(adam.hashCode());
		
		Superhero sh = new Superhero();
		
//		System.out.println(sh.name);
//		System.out.println(sh.fitnessLevel);
		
//		Object o = new Human("Objectified"); //o thinks it's pointing to an object. 
		
		
//		bob.move();
//		adam.move();
//		sh.move();
		
		
		Human h1 = new Human("Frank");
		
		h1.move();
		
		h1 = new Athlete("Frank");
		
		h1.move();
		
		
		h1 = new Superhero();

		h1.move();
		
		
//		Superhero sh1 = (Superhero) new Athlete("Frank");
	
//		Animal a;
//		
//		a.makeSound();
		
		QueueClass<Human> queueOfHumans = new QueueClass<Human>();
		
		queueOfHumans.add(h1);
		
		queueOfHumans.print();
		
	}

}
