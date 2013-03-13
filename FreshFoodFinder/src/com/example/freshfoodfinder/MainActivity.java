package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import com.google.android.gms.maps.model.LatLng;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {
	public static Food activeFood;
	public static final int UserMap_ID = 1;
	public static ArrayList<Food> allFoods;

	
	
	//This class will manage the code for the screen involving the search bar and buttons for food
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		init();
		super.onCreate(savedInstanceState);
		allFoods = new ArrayList<Food>();
		//-----fruits
		allFoods.add(new Food("Apple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		
		
		//-----veggies
		allFoods.add(new Food("Arugula", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Beets", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Broccoli", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Brussels sprouts", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cabbage", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Celery", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Collard Greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Kale", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lettuce", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Mustard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Peas", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Spinach", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Swiss Chard", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Turnip greens", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Bell pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cucumber", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Eggplant", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Pumpkin", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Squash", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Sweet corn", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Sweet pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Tomato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Zucchini", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Artichoke", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cauliflower", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Black-eyed peas", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Garbanzo", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Green bean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lentil", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lima Bean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Okra", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snap pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Snow pea", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Soybean", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Asparagus", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Florence fennel", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Garlic", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Leek", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Onion", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Scallion", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Shallot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Beetroot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Carrot", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Daikon", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Ginger", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Parsnip", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Radish", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Sweet potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Turnip", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Yam", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		
		
		
		
		
		
		
		ArrayAdapter<Food> adapter = new ArrayAdapter<Food>(this,
		        android.R.layout.simple_list_item_1, allFoods);
		    setListAdapter(adapter);		
	}
	  @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    super.onListItemClick(l, v, position, id);
	    // Get the item that was clicked
	    Food foodClickedByUser = (Food) this.getListAdapter().getItem(position);
	    activeFood = foodClickedByUser;
	    Intent i = new Intent(this, UserMap.class);
	    
	    //Puts the name of the active food into the UserMap activity
	    i.putExtra("com.example.freshfoodfinder.activeFood", activeFood.getName());
	    
	    startActivityForResult(i,UserMap_ID);
	   // Log.w(o.getName(), "ah");
	

	  }
	  
	  //Method used just to test the distanceTo function
	  public void init(){
			LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
			LatLng supremeLocation = new LatLng(39.954792,-75.208733);
			LatLng twenty3rdAndOregonShopRiteLocation = new LatLng(39.919951,-75.186009);
			LatLng mifflinAndSwansonShopRiteLocation = new LatLng(39.923308,-75.145326);
			Market freshGrocer = new Market("Fresh Grocer",allFoods,freshGrocerLocation);
			Market supreme = new Market("Supreme Supermarket",allFoods,supremeLocation);
			Market twenty3rdAndOregonShopRite = new Market("twenty3rdAndOregonShopRite",allFoods,twenty3rdAndOregonShopRiteLocation);
			Market mifflinAndSwansonShopRite = new Market("mifflinAndSwansonShopRite",allFoods,mifflinAndSwansonShopRiteLocation);
			
			float f = freshGrocer.getLocation().distanceTo(supreme.getLocation());
			Log.w(String.valueOf(f),"dist from Fresh Grocer to SUpreme");
		}
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}

}
