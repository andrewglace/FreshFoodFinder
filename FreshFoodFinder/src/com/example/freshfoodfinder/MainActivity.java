package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends ListActivity {
	public static Food activeFood;
	public static final int UserMap_ID = 1;
	public static ArrayList<Food> allFoods;
	public static ArrayList<Food> seasonalFoods;
	public static boolean togglerIsMap = true;
	
	//This class will manage the code for the screen involving the search bar and buttons for food
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		allFoods = Food.getAllFoods();
		
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
	  
	  public void goSeasonal(View view) {
		  
	  }
	  
	  public void toggleMapRecipe(View view) {
		  Button toggler = (Button) view;
		  if (togglerIsMap) {
			  toggler.setText(R.string.TogglerRecipe);
			  togglerIsMap = false;
		  } else {
			  toggler.setText(R.string.TogglerMap);
			  togglerIsMap = true;
		  }
	  }
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}

}
