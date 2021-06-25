package com.revature.fakecomputers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ComputerTest {
	
	Computer c;
	
	@Mock
	Abacus fakeAbacus;
	
	@Before
	public void setupComputer(){
		
//		Abacus a = new Abacus(); //we need to create some kind of "perfect version" of our abacus
		// we need to create a mock object. 
		
		fakeAbacus = mock(Abacus.class);
		
		when(fakeAbacus.basicAdd(0,0)).thenReturn(0.0);
		
		when(fakeAbacus.basicAdd(2, 3)).thenReturn(5.0);
		when(fakeAbacus.basicAdd(5.0, 5)).thenReturn(10.0);
		
//		when(fakeAbacus.basicAdd(1000, 2)).thenThrow(new Throwable());
		
		c = new Computer(fakeAbacus);
		
	}
	
	@Test
	public void testAdd() {
		
		/*
		 * We want to check that expected values are equal to the 
		 * 	actual values. 
		 */
		
		assertEquals(0, c.fancyAdd(0, 0, 0), 0.00001);
		assertEquals(10,c.fancyAdd(2, 3, 5),0.0001);
	
	}

}
