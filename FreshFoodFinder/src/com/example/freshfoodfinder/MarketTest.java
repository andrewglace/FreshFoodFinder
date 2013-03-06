package com.example.freshfoodfinder;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.google.android.gms.maps.model.LatLng;

public class MarketTest {

	Market freshGrocer;
	@Before
	public void setup() {
		Food apple = new Food("apple");
		Food banana = new Food("banana");
		Food carrot = new Food("carrot");
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(apple);
		foods.add(banana);
		foods.add(carrot);
		
		//This location is accurate
		LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		Market freshGrocer = new Market("Fresh Grocer",foods,freshGrocerLocation);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testNull() {
		Market market = new Market(null,null,null);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testNullName() {
		Food apple = new Food("apple");
		Food banana = new Food("banana");
		Food carrot = new Food("carrot");
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(apple);
		foods.add(banana);
		foods.add(carrot);
		foods.add(null);
		LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		Market market = new Market("market",foods,freshGrocerLocation);
	}
	
	@Test
	public void testHasFoodNormal() {
		assertTrue(freshGrocer.hasFood(new Food("apple")));
	}
	
	@Test
	public void testHasFoodNull() {
		assertTrue(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testAddFoodNormal() {
		freshGrocer.addFood(new Food("mango"));
		assertTrue(freshGrocer.hasFood(new Food("mango")));
	}
	
	@Test
	public void testAddFoodNull() {
		freshGrocer.addFood(null);
		assertFalse(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testRemoveFoodNormal() {
		freshGrocer.removeFood(new Food("apple"));
		assertFalse(freshGrocer.hasFood(new Food("apple")));
	}
	
	@Test
	public void testRemoveFoodNull() {
		freshGrocer.removeFood(null);
		assertFalse(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testRemoveFoodNotPresent() {
		freshGrocer.removeFood(new Food("mango"));
		assertFalse(freshGrocer.hasFood(new Food("mango")));
	}
}
