package com.example.freshfoodfinder.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.example.freshfoodfinder.Food;

public class FoodTest {
	public Food apple, banana, carrot, mango, appLE;
	@Before
	public void setUp() throws Exception {
		apple = new Food("apple");
		appLE = new Food("appLE");
	}

	@Test
	public void testEquality() {
		Food myApple = new Food("apple");
		
		assertEquals(apple, myApple);
		assertEquals(apple.hashCode(), myApple.hashCode());
		
		//these hashcode tests should fail unless mod is randomly the same
		assertFalse(apple.equals(appLE));
		assertFalse(apple.hashCode() == appLE.hashCode());
		assertFalse(apple.hashCode() == banana.hashCode());
	}

}
