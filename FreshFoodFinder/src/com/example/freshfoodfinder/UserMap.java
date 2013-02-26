package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.maps.GeoPoint;

public class UserMap extends Activity {

	private GoogleMap map;
	private MapFragment mapFragment;
	private GeoPoint geo;
	private LocationManager locationManager;
	private String provider;
	private Intent parcel;
	private Food activeFood;
	
	static final LatLng HAMBURG = new LatLng(53.558, 9.927);
	 static final LatLng KIEL = new LatLng(53.551, 9.993);
	
	private List<Market> markets; 
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usermap);
		mapFragment = ((MapFragment) getFragmentManager().findFragmentById(R.id.map));
		
		//Map setup
		map = mapFragment.getMap();
		setUpMapIfNeeded();
		GoogleMapOptions options = new GoogleMapOptions();
		options.mapType(GoogleMap.MAP_TYPE_NORMAL)
	    .compassEnabled(false)
	    .rotateGesturesEnabled(false)
	    .tiltGesturesEnabled(false);
		map.setMyLocationEnabled(true);
		
		markets = new ArrayList<Market>();
		
		//Get user location set
		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
	    // Define the criteria how to select the locatioin provider -> use
	    // default
	    Criteria criteria = new Criteria();
	    provider = locationManager.getBestProvider(criteria, false);
	    Location location = locationManager.getLastKnownLocation(provider);
	    
	    LatLng userLatLng = new LatLng(location.getLatitude(),location.getLongitude());
		
		/*Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
		        .title("Hamburg"));
		    Marker kiel = map.addMarker(new MarkerOptions()
		        .position(KIEL)
		        .title("Kiel")
		        .snippet("Kiel is cool")
		        .icon(BitmapDescriptorFactory
		            .fromResource(R.drawable.ic_launcher)));*/

	    instantiateMarkets();
	    
	  //Handle Intent
	    parcel = getIntent();
	    if (parcel != null) {
	    	//activeFood = (Food)parcel.getParcelableExtra("com.example.freshfoodfinder.activeFood");
	    }
	    //Make markers on map for the appropriate markets
	    //markMarkets(searchMarkets());
	    
		    // Move the camera instantly to user's location with a zoom of 15.
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(userLatLng, 30));

		    // Zoom in, animating the camera.
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapactivity, menu);
		return true;
	}
	
	private void instantiateMarkets() {
		Food apple = new Food("apple");
		Food banana = new Food("banana");
		Food carrot = new Food("carrot");
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(apple);
		foods.add(banana);
		foods.add(carrot);
		
		//This location is accurate
		LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		Market freshGrocer = new Market("Fresh Grocer",foods,freshGrocerLocation);
		markets.add(freshGrocer);
	}
	
	/*This method provided by the Google Documentation 
	 * https://developers.google.com/maps/documentation/android/map
	 */
	private void setUpMapIfNeeded() {
	    // Do a null check to confirm that we have not already instantiated the map.
	    if (map == null) {
	        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	                            .getMap();
	        // Check if we were successful in obtaining the map.
	        if (map != null) {
	            // The Map is verified. It is now safe to manipulate the map.

	        }
	    }
	}

	//Returns list of markets with the food
	private List<Market> searchMarkets() {
		List<Market> appropriateMarkets = new ArrayList<Market>();
		for (Market m : markets) {
			if (m.hasFood(activeFood)) {
				appropriateMarkets.add(m);
			}
		}
		return appropriateMarkets;
	}

	private void markMarkets(List<Market> marketsWithActiveFood) {
		if (marketsWithActiveFood == null) return;
		for (Market m : marketsWithActiveFood) {
			LatLng location = new LatLng(m.getLatLng().latitude,m.getLatLng().longitude);
		Marker market = map.addMarker(new MarkerOptions()
			.position(location)
		    .title(m.getName()));
		}
	}
}
