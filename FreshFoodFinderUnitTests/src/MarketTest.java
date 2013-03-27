

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;



public class MarketTest {

	Market freshGrocer;
	@Before
	public void setup() {
		Food apple = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		Food banana = new Food("banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		Food carrot = new Food("carrot", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(apple);
		foods.add(banana);
		foods.add(carrot);
		
		//This location is accurate
		//LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		freshGrocer = new Market("Fresh Grocer",foods);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testNull() {
		Market market = new Market(null,null);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testNullName() {
		Food apple = new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		Food banana = new Food("banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		Food carrot = new Food("carrot", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(apple);
		foods.add(banana);
		foods.add(carrot);
		foods.add(null);
		//LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		Market market = new Market("market",foods);
	}
	
	@Test
	public void testHasFoodNormal() {
		assertTrue(freshGrocer.hasFood(new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER)));
	}
	
	@Test
	public void testHasFoodNull() {
		assertFalse(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testAddFoodNormal() {
		freshGrocer.addFood(new Food("mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		assertTrue(freshGrocer.hasFood(new Food("mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER)));
	}
	
	@Test
	public void testAddFoodNull() {
		freshGrocer.addFood(null);
		assertFalse(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testRemoveFoodNormal() {
		freshGrocer.removeFood(new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		assertFalse(freshGrocer.hasFood(new Food("apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER)));
	}
	
	@Test
	public void testRemoveFoodNull() {
		freshGrocer.removeFood(null);
		assertFalse(freshGrocer.hasFood(null));
	}
	
	@Test
	public void testRemoveFoodNotPresent() {
		freshGrocer.removeFood(new Food("mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		assertFalse(freshGrocer.hasFood(new Food("mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER)));
	}
}
