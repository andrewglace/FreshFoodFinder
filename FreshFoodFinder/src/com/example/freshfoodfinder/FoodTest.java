package com.example.freshfoodfinder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import android.os.Parcel;
public class FoodTest {
	
	Food food1;
	Food food2;

	@Before
	public void setup() {
		food1 = new Food("apple");
		food2 = new Food("banana");
	}
	
	@Test
	public void testNullName() {
		Food foodNull = new Food(null);
		assertEquals(foodNull.getName(),null);
	}
	
	@Test
	public void testEqualsReflexive() {
		assertTrue(food1.equals(food1));
	}
	
	@Test
	public void testEqualsSymmetric() {
		Food food3 = new Food("apple");
		assertTrue(food1.equals(food3));
		assertTrue(food3.equals(food1));
	}
	
	@Test
	public void testEqualsTransitive() {
		Food food3 = new Food("apple");
		Food food4 = new Food("apple");
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
