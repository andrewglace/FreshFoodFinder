package com.example.freshfoodfinder.test;
import org.junit.Test;
import com.example.freshfoodfinder.*;

import android.app.Activity;

import com.example.freshfoodfinder.MainActivity;

public class MainActivityTest extends android.test.ActivityInstrumentationTestCase2<MainActivity>{
	Activity mainActivity;

	public MainActivityTest() {
		super("com.example.freshfoodfinder",MainActivity.class);
	}
	
	public void  setUp() throws Exception {
		super.setUp();
		mainActivity = this.getActivity();
		
	}
	
	@Test
	public void testAppleButton() {
		
	Button apple = (Button)mainActivity.findViewById(id)
		// this runs the code in the Activity's UI thread
		mainActivity.runOnUiThread(new Runnable() {
				public void run() {
						button.performClick();
					}
				});
		// this waits for the UI to finish its stuff
		getInstrumentation().waitForIdleSync();
	}
}
