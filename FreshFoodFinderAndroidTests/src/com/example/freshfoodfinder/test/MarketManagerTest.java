package com.example.freshfoodfinder.test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import android.location.Location;
import android.test.AndroidTestCase;

import com.example.freshfoodfinder.Food;
import com.example.freshfoodfinder.Market;
import com.example.freshfoodfinder.MarketManager;
import com.google.android.gms.maps.model.LatLng;

public class MarketManagerTest extends AndroidTestCase{

	private MarketManager manager;
	private Location userLocation;
	private Food desiredFood;
	private Food collardGreens;
	
	public void setUp() {
		userLocation = new Location("provider");
		//This location is the corner of 40th street and Walnut
		userLocation.setLatitude(39.953992);
		userLocation.setLongitude(-75.202639);
		//Food equality only uses name so other fields do not matter
		desiredFood = new Food("Apple",1,1,1,"");
		collardGreens = new Food("Collard Greens",1,1,1,"");
	}
	
	@Test
	public void testOneMile() {
	
		manager = new MarketManager(desiredFood,userLocation,1609);
		ArrayList<Market> trimmedMarkets = manager.filterMarkets(manager.getAllMarkets());
		ArrayList<Food> blankFoods = new ArrayList<Food>();
		LatLng freshGrocerLocation40thWalnut = new LatLng(39.954499,-75.202864);
		LatLng supreme43rdWalnutLocation = new LatLng(39.954792,-75.208733);
		
		Market freshGrocer40thWalnut = new Market("Fresh Grocer",blankFoods,freshGrocerLocation40thWalnut);
		Market supreme43rdWalnut = new Market("Supreme Shop N Bag",blankFoods,supreme43rdWalnutLocation);
		assertTrue(trimmedMarkets.contains(freshGrocer40thWalnut));
		assertTrue(trimmedMarkets.contains(supreme43rdWalnut));
		LatLng shoprite24thOregonAveLocation = new LatLng(39.919672,-75.188367);
		
		Market shoprite24thOregonAve = new Market("ShopRite",blankFoods,shoprite24thOregonAveLocation);
		assertFalse(trimmedMarkets.contains(shoprite24thOregonAve));
	}
	
	@Test
	public void testTwoMiles() {
	
		manager = new MarketManager(desiredFood,userLocation,3218);
		ArrayList<Market> trimmedMarkets = manager.filterMarkets(manager.getAllMarkets());
		ArrayList<Food> blankFoods = new ArrayList<Food>();
		LatLng freshGrocerLocation40thWalnut = new LatLng(39.954499,-75.202864);
		LatLng supreme43rdWalnutLocation = new LatLng(39.954792,-75.208733);
		
		Market freshGrocer40thWalnut = new Market("Fresh Grocer",blankFoods,freshGrocerLocation40thWalnut);
		Market supreme43rdWalnut = new Market("Supreme Shop N Bag",blankFoods,supreme43rdWalnutLocation);
		assertTrue(trimmedMarkets.contains(freshGrocer40thWalnut));
		assertTrue(trimmedMarkets.contains(supreme43rdWalnut));
		LatLng shoprite24thOregonAveLocation = new LatLng(39.919672,-75.188367);
		
		Market shoprite24thOregonAve = new Market("ShopRite",blankFoods,shoprite24thOregonAveLocation);
		assertTrue(trimmedMarkets.contains(shoprite24thOregonAve));
	}
	
	@Test
	public void testNoLimit() {
		
		manager = new MarketManager(collardGreens,userLocation,0);
		ArrayList<Market> trimmedMarkets = manager.filterMarkets(manager.getAllMarkets());
		
		//Collard Greens are in season in April so this test gets all of the markets except Wawa
		//but it is only expected to work when collard greens are in season
		assertTrue(trimmedMarkets.containsAll(manager.getCornerStores()));
		//assertTrue(trimmedMarkets.contains(manager.getAldis()));
		assertTrue(trimmedMarkets.containsAll(manager.getSuperMarkets()));
		assertTrue(trimmedMarkets.containsAll(manager.getFarmerMarkets()));
	}
	
}
