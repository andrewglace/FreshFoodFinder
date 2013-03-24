package com.example.freshfoodfinder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class FoodTest {
	
	Food food1;
	Food food2;

	@Before
	public void setup() {
		food1 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		food2 = new Food("banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	}
	
	@Test
	public void testNullName() {
		Food foodNull = new Food(null, 1, Calendar.JANUARY, Calendar.DECEMBER);
		assertEquals(foodNull.getName(),null);
	}
	
	@Test
	public void testEqualsReflexive() {
		assertTrue(food1.equals(food1));
	}
	
	@Test
	public void testEqualsSymmetric() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		assertTrue(food1.equals(food3));
		assertTrue(food3.equals(food1));
	}
	
	@Test
	public void testEqualsTransitive() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		Food food4 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		assertTrue(food1.equals(food3));
		assertTrue(food3.equals(food4));
		assertTrue(food1.equals(food4));
	}
	
	@Test
	public void testNonEquality() {
		assertFalse(food1.equals(food2));
		assertFalse(food2.equals(food1));
	}
	
	@Test
	public void testToString() {
		assertTrue(food1.toString().equals("apple"));
	}
}
