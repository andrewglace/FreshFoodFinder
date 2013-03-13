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
		allFoods.add(new Food("Apricot", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Avocado", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Blackberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Blueberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cantaloupe", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Cherry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Clementine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Coconut", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Date", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Fig", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Grape", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Grapefruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Honeydew", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Kiwi fruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lemon", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Lime", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Nectarine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Orange", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Peach", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Pear", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Plum", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));	
		allFoods.add(new Food("Pineapple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Pomegranate", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Raspberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Strawberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Tangerine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		allFoods.add(new Food("Watermelon", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));

		
		
		
		
		
		
		
		//-----veggies
		
		
		

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
