package com.example.freshfoodfinder;

import java.util.ArrayList;

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
	//This class will manage the code for the screen involving the search bar and buttons for food
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		init();
		super.onCreate(savedInstanceState);
		 Food banana = new Food("banana");
		 Food apple = new Food("apple");
		 Food carrot = new Food("carrot");

		ArrayList<Food> values = new ArrayList<Food>();
		values.add(banana);
		values.add(carrot);
		values.add(apple);

		    ArrayAdapter<Food> adapter = new ArrayAdapter<Food>(this,
		        android.R.layout.simple_list_item_1, values);
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
			Food apple = new Food("apple");
			Food banana = new Food("banana");
			Food carrot = new Food("carrot");
			ArrayList<Food> foods = new ArrayList<Food>();
			foods.add(apple);
			foods.add(banana);
			foods.add(carrot);
			LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
			LatLng supremeLocation = new LatLng(39.954792,-75.208733);
			LatLng twenty3rdAndOregonShopRiteLocation = new LatLng(39.919951,-75.186009);
			LatLng mifflinAndSwansonShopRiteLocation = new LatLng(39.923308,-75.145326);
			Market freshGrocer = new Market("Fresh Grocer",foods,freshGrocerLocation);
			Market supreme = new Market("Supreme Supermarket",foods,supremeLocation);
			Market twenty3rdAndOregonShopRite = new Market("twenty3rdAndOregonShopRite",foods,twenty3rdAndOregonShopRiteLocation);
			Market mifflinAndSwansonShopRite = new Market("mifflinAndSwansonShopRite",foods,mifflinAndSwansonShopRiteLocation);
			
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
