package com.example.freshfoodfinder;
import java.util.ArrayList;
import java.util.Calendar;

import android.os.Parcel;
import android.os.Parcelable;
public class Food implements Parcelable {
	private String name;
	private int foodId;
	private Calendar seasonStart;
	private Calendar seasonEnd;
	
	public static final int FOOD_FRUIT = 1;
	public static final int FOOD_VEG = 2;
	
	
	
	public Food(String foodName, int foodType, int seasonStart, int seasonEnd) {
		name=foodName;
	}
	public String getName(){
		return name;
	}
	@Override
	public int hashCode(){		
		return name.hashCode();
	}
	@Override
	public String toString() {	
		return name.toString();
	}
	@Override
	public boolean equals(Object o){
		if(o.hashCode()==hashCode()){
			return true;
		}
		return false;
	}
	
	public static ArrayList<Food> getAllFoods() {
		ArrayList<Food> allFoods = new ArrayList<Food>();
		allFoods = new ArrayList<Food>(getAllFruits());
		allFoods.add(new Food("Asparagus", Food.FOOD_VEG, Calendar.MAY, Calendar.JUNE));
		allFoods.add(new Food("Artichoke", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Arugula", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Beets", Food.FOOD_VEG, Calendar.JUNE, Calendar.DECEMBER));
		allFoods.add(new Food("Beetroot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Bell pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Black-eyed peas", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Broccoli", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER));
		allFoods.add(new Food("Brussels sprouts", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Cabbage", Food.FOOD_VEG, Calendar.JUNE, Calendar.OCTOBER));
		allFoods.add(new Food("Carrot", Food.FOOD_VEG, Calendar.JUNE, Calendar.SEPTEMBER));
		allFoods.add(new Food("Cauliflower", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER));
		allFoods.add(new Food("Celery", Food.FOOD_VEG, Calendar.AUGUST, Calendar.OCTOBER));
		allFoods.add(new Food("Collard Greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cucumber", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Daikon", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Eggplant", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Florence fennel", Food.FOOD_VEG, Calendar.OCTOBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Garlic", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));//STORED YEAR ROUND THOUGH
		allFoods.add(new Food("Garbanzo", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Ginger", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Green Beans", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Kale", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER));
		allFoods.add(new Food("Leek", Food.FOOD_VEG, Calendar.AUGUST, Calendar.DECEMBER));
		allFoods.add(new Food("Lentil", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lettuce", Food.FOOD_VEG, Calendar.MAY, Calendar.OCTOBER));
		allFoods.add(new Food("Lima Bean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Mustard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Okra", Food.FOOD_VEG, Calendar.AUGUST, Calendar.SEPTEMBER));
		allFoods.add(new Food("Onion", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Parsnip", Food.FOOD_VEG, Calendar.APRIL, Calendar.MAY)); //AND OCTOBER - DECEMBER
		allFoods.add(new Food("Peas", Food.FOOD_VEG, Calendar.JUNE, Calendar.JULY));
		allFoods.add(new Food("Pumpkin", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Potato", Food.FOOD_VEG, Calendar.JULY, Calendar.DECEMBER));
		allFoods.add(new Food("Scallion", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Shallot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snap pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snow pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Soybean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Spinach", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Squash", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));//AND AGUST-DECEMBER
		allFoods.add(new Food("Sweet corn", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Sweet pepper", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Sweet potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Swiss Chard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Radish", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Tomato", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Turnip", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER));
		allFoods.add(new Food("Turnip greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Yam", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Zucchini", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		return allFoods;

	}
	
	public static ArrayList<Food> getAllFruits() {
		ArrayList<Food> allFoods = new ArrayList<Food>();
		//-----fruits
		allFoods.add(new Food("Apple", Food.FOOD_FRUIT, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Apricot", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Avocado", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Blackberry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST));
		allFoods.add(new Food("Blueberry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST));
		allFoods.add(new Food("Cantaloupe", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER));
		allFoods.add(new Food("Cherry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.JULY));
		allFoods.add(new Food("Clementine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Coconut", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Date", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Fig", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Grape", Food.FOOD_FRUIT, Calendar.SEPTEMBER, Calendar.OCTOBER));
		allFoods.add(new Food("Grapefruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Honeydew", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Kiwi fruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lemon", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lime", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Nectarine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Orange", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Peach", Food.FOOD_FRUIT, Calendar.JULY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Pear", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.DECEMBER));
		allFoods.add(new Food("Plum", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER));	
		allFoods.add(new Food("Pineapple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Pomegranate", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Raspberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Strawberry", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JUNE));
		allFoods.add(new Food("Tangerine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Watermelon", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.OCTOBER));
		
		return allFoods;
		
	}
	
	public static ArrayList<Food> getAllVeggies() {
		//-----veggies
		ArrayList<Food> allFoods = new ArrayList<Food>();
		allFoods.add(new Food("Asparagus", Food.FOOD_VEG, Calendar.MAY, Calendar.JUNE));
		allFoods.add(new Food("Artichoke", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Arugula", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Beets", Food.FOOD_VEG, Calendar.JUNE, Calendar.DECEMBER));
		allFoods.add(new Food("Beetroot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Bell pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Black-eyed peas", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Broccoli", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER));
		allFoods.add(new Food("Brussels sprouts", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Cabbage", Food.FOOD_VEG, Calendar.JUNE, Calendar.OCTOBER));
		allFoods.add(new Food("Carrot", Food.FOOD_VEG, Calendar.JUNE, Calendar.SEPTEMBER));
		allFoods.add(new Food("Cauliflower", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER));
		allFoods.add(new Food("Celery", Food.FOOD_VEG, Calendar.AUGUST, Calendar.OCTOBER));
		allFoods.add(new Food("Collard Greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cucumber", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Daikon", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Eggplant", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Florence fennel", Food.FOOD_VEG, Calendar.OCTOBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Garlic", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));//STORED YEAR ROUND THOUGH
		allFoods.add(new Food("Garbanzo", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Ginger", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Green Beans", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Kale", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER));
		allFoods.add(new Food("Leek", Food.FOOD_VEG, Calendar.AUGUST, Calendar.DECEMBER));
		allFoods.add(new Food("Lentil", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lettuce", Food.FOOD_VEG, Calendar.MAY, Calendar.OCTOBER));
		allFoods.add(new Food("Lima Bean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Mustard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Okra", Food.FOOD_VEG, Calendar.AUGUST, Calendar.SEPTEMBER));
		allFoods.add(new Food("Onion", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Parsnip", Food.FOOD_VEG, Calendar.APRIL, Calendar.MAY)); //AND OCTOBER - DECEMBER
		allFoods.add(new Food("Peas", Food.FOOD_VEG, Calendar.JUNE, Calendar.JULY));
		allFoods.add(new Food("Pumpkin", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER));
		allFoods.add(new Food("Potato", Food.FOOD_VEG, Calendar.JULY, Calendar.DECEMBER));
		allFoods.add(new Food("Scallion", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Shallot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snap pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snow pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Soybean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Spinach", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Squash", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));//AND AGUST-DECEMBER
		allFoods.add(new Food("Sweet corn", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Sweet pepper", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		allFoods.add(new Food("Sweet potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Swiss Chard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Radish", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Tomato", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));
		allFoods.add(new Food("Turnip", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER));
		allFoods.add(new Food("Turnip greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Yam", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Zucchini", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		return allFoods;
	}
	
	public static ArrayList<Food> getSeasonalFoods(ArrayList<Food> foods) {
		Calendar current = Calendar.getInstance();
		int month = current.get(Calendar.MONTH);
		
		for (Food f : foods) {
			
		}
		return null;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
