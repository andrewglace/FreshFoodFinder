package com.example.freshfoodfinder.test;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import android.test.AndroidTestCase;

import com.example.freshfoodfinder.Food;

public class FoodTest extends AndroidTestCase{
	
	Food food1;
	Food food2;

	
	public void setUp() {
		food1 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER,"");
		food2 = new Food("banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER,"");
	}
	
	@Test
	public void testNullName() {
		Food foodNull = new Food(null, 1, Calendar.JANUARY, Calendar.DECEMBER,"");
		assertEquals(foodNull.getName(),null);
	}
	
	@Test
	public void testEqualsReflexive() {
		assertTrue(food1.equals(food1));
	}
	
	@Test
	public void testEqualsSymmetric() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER,"");
		assertTrue(food1.equals(food3));
		assertTrue(food3.equals(food1));
	}
	
	@Test
	public void testEqualsTransitive() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER,"");
		Food food4 = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER,"");
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
	
	@Test
	public void testSeasonalityEdgeCase() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.OCTOBER, Calendar.FEBRUARY,"");
		Food food4 = new Food("banana", Food.FOOD_FRUIT, Calendar.SEPTEMBER, Calendar.APRIL,"");
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(food3);
		foods.add(food4);
		foods = Food.getSeasonalFoods(foods, Calendar.JANUARY);
		assertTrue(foods.contains(food3));
		assertTrue(foods.contains(food4));
	}
	
	@Test public void testSeasonalityOnlyMonthInSeason() {
		Food food3 = new Food("apple", Food.FOOD_FRUIT, Calendar.OCTOBER, Calendar.OCTOBER,"");
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(food3);
		foods = Food.getSeasonalFoods(foods, Calendar.OCTOBER);
		assertTrue(foods.contains(food3));
	}
}
