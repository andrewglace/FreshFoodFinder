package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MapActivity extends Activity {

	private GoogleMap mMap;
	private MapFragment mapFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		init();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapactivity);
		mapFragment = ((MapFragment) getFragmentManager().findFragmentById(R.id.map));
		mMap = mapFragment.getMap();
		setUpMapIfNeeded();
		GoogleMapOptions options = new GoogleMapOptions();
		options.mapType(GoogleMap.MAP_TYPE_NORMAL)
	    .compassEnabled(false)
	    .rotateGesturesEnabled(false)
	    .tiltGesturesEnabled(false);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapactivity, menu);
		return true;
	}
	
	
	/*This method provided by the Google Documentation 
	 * https://developers.google.com/maps/documentation/android/map
	 */
	private void setUpMapIfNeeded() {
	    // Do a null check to confirm that we have not already instantiated the map.
	    if (mMap == null) {
	        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	                            .getMap();
	        // Check if we were successful in obtaining the map.
	        if (mMap != null) {
	            // The Map is verified. It is now safe to manipulate the map.

	        }
	    }
	}
	public void init(){
		ArrayList<Food> foods = new ArrayList<Food>();
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

}
