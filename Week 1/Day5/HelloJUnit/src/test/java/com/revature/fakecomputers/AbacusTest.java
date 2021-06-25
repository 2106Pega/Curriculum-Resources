package com.revature.fakecomputers;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AbacusTest {
	
	Abacus a = new Abacus();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void trueSetup() {
		System.out.println("This is before everything!");
	}
	
	@AfterClass
	public static void afterEverything() {
		/*
		 * The class is destroyed, so we need this to be stat
		 */
		System.out.println("After everything!");
	}

	@Before
	public void setup() {
		/*
		 * this method will be inovked before every test method!
		 * allows us to setup our classes to be tested 
		 */
		
		System.out.println("Before");
		System.out.println("-------------------------------");
	}
	
	@After
	public void reset() {
		/*
		 * Invoked after each test
		 */
		System.out.println("-------------------------------");
		System.out.println("After");
	}
	
	
	@Test
	public void testAdd() {
		
		/*
		 * We want to check that expected values are equal to the 
		 * 	actual values. 
		 */
		
		assertEquals(0, a.basicAdd(0, 0), 0.00001);
		assertEquals(10,a.basicAdd(5, 5),0.0001);
		assertEquals(10,a.basicAdd(2, 8),0.0001);
		assertEquals(11.0,a.basicAdd(7.0,4.0), 0);	
	}
	
	@Test
	public void testDivide() {
		
		assertEquals(5,a.divide(50,10),0.0001);
		assertEquals(7,a.divide(35,5),0.0001);
		assertEquals(3,a.divide(60,20),0.0001);
		assertEquals(2,a.divide(50,25),0.0001);
			
	}
	
	@Test
	public void testDivideError() {
		
		System.out.println("Testing the arithimitic exception of divide!");
		
		thrown.expect(ArithmeticException.class);
//		throw new ArithmeticException();
		a.divide(0, 0); //What should happen here? It should throw an arithmitic exception
		
	}
}
