package com.revature.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.models.MenuItems;
import com.revature.repository.Cooler;

public class KitchenImplTest {
	
	Kitchen k; //we're testing the kitchen! we don't want a fake perfect version of it
	
	@Mock
	Cooler c;
	//Test driven development 
	
	List<MenuItems> fakeList;
	
	@Before
	public void prepareKitchen() {
		
		
		c = mock(Cooler.class);
		
		 fakeList = new ArrayList<>();
		 
		 fakeList.add(new MenuItems("fake1", 1, true));
		 fakeList.add(new MenuItems("fake2", 2, false));
		
		
		when(c.selectAllMenuItems()).thenReturn(fakeList);
		
		k = new KitchenImpl(c);
	}
	
	@Test
	public void testMenuItems() {
		
		assertEquals(fakeList.get(0), k.allMenuItems().get(0));
		assertEquals(fakeList.get(1), k.allMenuItems().get(1));
		
	}
	
	@Test
	public void testFoodItems() {
		
		assertEquals(fakeList.size()-1,k.foodMenu());
		
	}
	
	@Test
	public void testDrinkItems() {
		
		assertEquals(fakeList.size()-1,k.drinksMenu());
	}

}
