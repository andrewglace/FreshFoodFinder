package com.example.freshfoodfinder;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;


public class MainActivity extends ListActivity {
	public static Food activeFood;
	public static final int UserMap_ID = 1;
	public static ArrayList<Food> allFoods;
	public static ArrayList<Food> seasonalFoods;
	public static boolean togglerIsMap = true;
	public static boolean isSeasonal = false;
	
	//This class will manage the code for the screen involving the search bar and buttons for food
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		allFoods = Food.getAllFoods();
		seasonalFoods = Food.getSeasonalFoods(allFoods);
		
		ColoredArrayAdapter<Food> adapter = new ColoredArrayAdapter<Food>(this,
		        android.R.layout.simple_list_item_1, allFoods);
		setListAdapter(adapter);
		
		RadioButton mapButton = (RadioButton) this.findViewById(R.id.radioButtonMap);
		mapButton.setChecked(true);
	}
	  @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    super.onListItemClick(l, v, position, id);
	    // Get the item that was clicked
	    Food foodClickedByUser = (Food) this.getListAdapter().getItem(position);
	    activeFood = foodClickedByUser;
	    Bundle bundle = new Bundle();
	    bundle.putString("activeFoodName",activeFood.getName());
	    SearchRadiusDialogFragment searchRadiusQuery = new SearchRadiusDialogFragment();
	    searchRadiusQuery.setArguments(bundle);
	    searchRadiusQuery.show(getFragmentManager(), "search radius");
	    /*Intent i = new Intent(this, SearchRadiusDialogFragment.class);
	    
	    //Puts the name of the active food into the UserMap activity
	    i.putExtra("activeFoodName", activeFood.getName());
	    
	    startActivityForResult(i,UserMap_ID);*/
	    
	  }
	  
	  public void goSeasonal(View view) {
		  if (isSeasonal) {
			  isSeasonal = false;
			 ArrayAdapter<Food> adapter = new ColoredArrayAdapter<Food>(this,
					  android.R.layout.simple_list_item_1, allFoods);
			  setListAdapter(adapter);
		  }
		  else {
			  isSeasonal = true;
			  ArrayAdapter<Food> adapter = new ColoredArrayAdapter<Food>(this,
					  android.R.layout.simple_list_item_1, seasonalFoods);
			  setListAdapter(adapter);
		  }
	  }
	  
	  public void toggleMap(View view) {
		  togglerIsMap = true;
	  }
	  
	  public void toggleRecipe(View view) {
		  togglerIsMap = false;
	  }
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}

}
