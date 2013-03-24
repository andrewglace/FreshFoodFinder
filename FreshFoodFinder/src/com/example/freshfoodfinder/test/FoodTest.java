package com.example.freshfoodfinder.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.example.freshfoodfinder.Food;

public class FoodTest {
	public Food apple, banana, carrot, mango, appLE;
	@Before
	public void setUp() throws Exception {
		apple = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		appLE = new Food("appLE", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	}

	@Test
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
