package com.example.freshfoodfinder.test;

import java.util.Calendar;

import junit.framework.TestCase;

import com.example.freshfoodfinder.Food;

public class FoodTester extends TestCase {
	public Food apple, banana, carrot, mango, appLE;

	protected void setUp() throws Exception {
		super.setUp();
		apple = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		appLE = new Food("appLE", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);

	}

	public void testEquality() {
		Food myApple = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		
		assertEquals(apple, myApple);
		assertEquals(apple.hashCode(), myApple.hashCode());
		
		//these hashcode tests should fail unless mod is randomly the same
		assertFalse(apple.equals(appLE));
		assertFalse(apple.hashCode() == appLE.hashCode());
		assertFalse(apple.hashCode() == banana.hashCode());
	}

}
