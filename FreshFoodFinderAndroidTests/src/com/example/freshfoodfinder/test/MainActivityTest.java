package com.example.freshfoodfinder.test;
import org.junit.Test;


import android.widget.RadioButton;

import com.example.freshfoodfinder.MainActivity;
import com.example.freshfoodfinder.R;

public class MainActivityTest extends android.test.ActivityInstrumentationTestCase2<MainActivity>{
	MainActivity mainActivity;
	RadioButton mapButton;
	RadioButton recipeButton;

	public MainActivityTest() {
		super("com.example.freshfoodfinder",MainActivity.class);
	}
	
	
	public void  setUp() throws Exception {
		super.setUp();
		mainActivity = (MainActivity)this.getActivity();
		mapButton = (RadioButton) mainActivity.findViewById(R.id.radioButtonMap);
		recipeButton = (RadioButton) mainActivity.findViewById(R.id.radioButtonRecipe);
	}
	
	@Test
	public void testMapEverything() throws Exception {
		setUp();
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				mapButton.toggle();
				
			}
		});
		assertTrue(mapButton.isChecked());
		assertTrue(mainActivity.togglerIsMap);
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				mapButton.toggle();
				
			}
		});
		assertTrue(mapButton.isChecked());
		assertTrue(mainActivity.togglerIsMap);
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				recipeButton.toggle();
				recipeButton.performClick();
				
			}
		});
		
		assertFalse(mapButton.isChecked());
		assertTrue(recipeButton.isChecked());
		
	}
	
	/*@Test
	public void testRecipeToggleClick() throws Exception {
		
		assertFalse(recipeButton.isChecked());
		assertTrue(mainActivity.togglerIsMap);
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				recipeButton.toggle();
			}
		});

		assertTrue(recipeButton.isChecked());
		assertFalse(mainActivity.togglerIsMap);
		assertFalse(mapButton.isChecked());
	}*/
	
	/*@Test
	public void testRecipeToggleRedundantClick() throws Exception {
		setUp();
		assertFalse(recipeButton.isChecked());
		assertTrue(mainActivity.togglerIsMap);
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				recipeButton.performClick();
			}
		});
		assertTrue(recipeButton.isChecked());
		assertFalse(mainActivity.togglerIsMap);
		assertFalse(mapButton.isChecked());
		mainActivity.runOnUiThread(new Runnable() {
			public void run() {
				recipeButton.performClick();
			}
		});
		assertTrue(recipeButton.isChecked());
		assertFalse(mainActivity.togglerIsMap);
		assertFalse(mapButton.isChecked());
	}*/
	

}
