package com.example.freshfoodfinder;
import java.util.ArrayList;
import java.util.Calendar;

import android.os.Parcel;
import android.os.Parcelable;
public class Food implements Parcelable {
	private String name;
	private int foodType;
	private int seasonStart;
	private int seasonEnd;
	
	public static final int FOOD_FRUIT = 1;
	public static final int FOOD_VEG = 2;
	
	
	
	public Food(String foodName, int foodType, int seasonStart, int seasonEnd) {
		name=foodName;
		this.foodType = foodType;
		this.seasonStart = seasonStart;
		this.seasonEnd = seasonEnd;
	}
	public String getName(){
		return name;
	}
	public int getSeasonStart() {
		return seasonStart;
	}
	public int getSeasonEnd() {
		return seasonEnd;
	}
	public int getFoodType() {
		return this.foodType;
	}
	public void setFoodType(int foodType) {
		this.foodType = foodType;
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
	
	//Code added by Andrew to just make one copy of all the foods
	//Included most up-to-date seasonality form Nick
	public static Food asparagus = new Food("Asparagus", Food.FOOD_VEG, Calendar.MAY, Calendar.JUNE);
	public static Food artichoke = new Food("Artichoke", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food arugula = new Food("Arugula", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER);
	public static Food beets = new Food("Beets", Food.FOOD_VEG, Calendar.JUNE, Calendar.DECEMBER);
	public static Food beetroot = new Food("Beetroot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food bellPepper = new Food("Bell pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food blackEyedPeas = new Food("Black-eyed peas", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food broccoli = new Food("Broccoli", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER);
	public static Food brusselsSprouts = new Food("Brussels sprouts", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER);
	public static Food cabbage = new Food("Cabbage", Food.FOOD_VEG, Calendar.JUNE, Calendar.OCTOBER);
	public static Food carrot = new Food("Carrot", Food.FOOD_VEG, Calendar.JUNE, Calendar.SEPTEMBER);
	public static Food cauliflower = new Food("Cauliflower", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER);
	public static Food celery = new Food("Celery", Food.FOOD_VEG, Calendar.AUGUST, Calendar.OCTOBER);
	public static Food collardGreens =new Food("Collard Greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food cucumber = new Food("Cucumber", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food daikon = new Food("Daikon", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food eggplant = new Food("Eggplant", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER);
	public static Food florenceFennel = new Food("Florence fennel", Food.FOOD_VEG, Calendar.OCTOBER, Calendar.NOVEMBER);
	public static Food garlic = new Food("Garlic", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER);//STORED YEAR ROUND THOUGH
	public static Food garbanzo = new Food("Garbanzo", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food ginger = new Food("Ginger", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food greenBeans = new Food("Green Beans", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food kale = new Food("Kale", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER);
	public static Food leek = new Food("Leek", Food.FOOD_VEG, Calendar.AUGUST, Calendar.DECEMBER);
	public static Food lentil = new Food("Lentil", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food lettuce = new Food("Lettuce", Food.FOOD_VEG, Calendar.MAY, Calendar.OCTOBER);
	public static Food limaBean = new Food("Lima Bean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food mustard = new Food("Mustard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food okra = new Food("Okra", Food.FOOD_VEG, Calendar.AUGUST, Calendar.SEPTEMBER);
	public static Food onion = new Food("Onion", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER);
	public static Food parsnip = new Food("Parsnip", Food.FOOD_VEG, Calendar.APRIL, Calendar.MAY); //AND OCTOBER - DECEMBER
	public static Food peas = new Food("Peas", Food.FOOD_VEG, Calendar.JUNE, Calendar.JULY);
	public static Food pumpkin = new Food("Pumpkin", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER);
	public static Food potato = new Food("Potato", Food.FOOD_VEG, Calendar.JULY, Calendar.DECEMBER);
	public static Food scallion = new Food("Scallion", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER);
	public static Food shallot = new Food("Shallot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food snapPea = new Food("Snap pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food snowPea = new Food("Snow pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food soybean = new Food("Soybean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food spinach = new Food("Spinach", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER);
	public static Food squash = new Food("Squash", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER);//AND AGUST-DECEMBER
	public static Food sweetCorn = new Food("Sweet corn", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food sweetPepper = new Food("Sweet pepper", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER);
	public static Food sweetPotato = new Food("Sweet potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food swissChard = new Food("Swiss Chard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food radish = new Food("Radish", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER);
	public static Food tomato = new Food("Tomato", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER);
	public static Food turnip = new Food("Turnip", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER);
	public static Food turnipGreens = new Food("Turnip greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food yam = new Food("Yam", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food zucchini = new Food("Zucchini", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER);
	
	//Fruits
	public static Food apple = new Food("Apple", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.APRIL);
	public static Food apricot = new Food("Apricot", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST);
	public static Food avocado = new Food("Avocado", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food banana = new Food("Banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food blackberry = new Food("Blackberry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.SEPTEMBER);
	public static Food blueberry = new Food("Blueberry", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JUNE);
	public static Food cantaloupe = new Food("Cantaloupe", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JULY);
	public static Food cherry = new Food("Cherry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.JULY);
	public static Food clementine = new Food("Clementine", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JUNE);
	public static Food coconut = new Food("Coconut", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food data = new Food("Date", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food fig = new Food("Fig", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food grape = new Food("Grape", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER);
	public static Food grapeFruit = new Food("Grapefruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food honeydew = new Food("Honeydew", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JULY);
	public static Food kiwi = new Food("Kiwi fruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food lemon = new Food("Lemon", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food lime = new Food("Lime", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food mango = new Food("Mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food nectarine = new Food("Nectarine", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST);
	public static Food orange = new Food("Orange", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food peach = new Food("Peach", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.SEPTEMBER);
	public static Food pear = new Food("Pear", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.AUGUST);
	public static Food plum = new Food("Plum", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER);	
	public static Food pineapple = new Food("Pineapple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food pomegranate = new Food("Pomegranate", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food raspberry = new Food("Raspberry", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JUNE);
	public static Food strawberry = new Food("Strawberry", Food.FOOD_FRUIT, Calendar.MAY, Calendar.JUNE);
	public static Food tangerine = new Food("Tangerine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER);
	public static Food watermelon = new Food("Watermelon", Food.FOOD_FRUIT, Calendar.JULY, Calendar.SEPTEMBER);
	
			
	
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
		allFoods.add(new Food("Zucchini", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));
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
		//current.set(Calendar.MONTH, Calendar.JUNE); //remove this later!
		int currentMonth = current.get(Calendar.MONTH);
		ArrayList<Food> seasonalFoods = new ArrayList<Food>();
		
		for (Food f : foods) {
			//We do not count foods that have seasons of "january" and "december"
			if (f.seasonStart == Calendar.JANUARY && 
					f.seasonEnd == Calendar.DECEMBER) {
				continue;
			}
			if(currentMonth >= f.seasonStart && currentMonth <= f.seasonEnd) {
				seasonalFoods.add(f);
			}
			
		}
		return seasonalFoods;
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
