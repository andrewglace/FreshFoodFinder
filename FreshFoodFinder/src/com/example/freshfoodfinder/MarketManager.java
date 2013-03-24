package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import com.google.android.gms.maps.model.LatLng;

public class MarketManager {

	private ArrayList<Food> superMarketFoods;
	private ArrayList<Food> wawaFoods;
	private ArrayList<Food> cornerStoreFoods;
	private ArrayList<Food> farmerMarketFoods;
	private ArrayList<Food> aldiFoods;
	
	private ArrayList<Market> superMarkets;
	private ArrayList<Market> wawas;
	private ArrayList<Market> cornerStores;
	private ArrayList<Market> farmerMarkets;
	
	//We'll still instiate Aldi as a list so we dont have to treat it specially
	private ArrayList<Market> aldi;
	
	public MarketManager() {
		superMarketFoods = new ArrayList<Food>();
		wawaFoods = new ArrayList<Food>();
		cornerStoreFoods = new ArrayList<Food>();
		farmerMarketFoods = new ArrayList<Food>();
		aldiFoods = new ArrayList<Food>();
		
		superMarkets = new ArrayList<Market>();
		wawas = new ArrayList<Market>();
		cornerStores = new ArrayList<Market>();
		farmerMarkets = new ArrayList<Market>();
		aldi = new ArrayList<Market>();
		
		
		instantiateSuperMarketFoods();
		instantiateWawaFoods();
		instantiateCornerStoreFoods();
		instantiateFarmerMarketFoods();
		instantiateAldiFoods();
		
		instantiateSuperMarkets();
		instantiateWawas();
		instantiateCornerStores();
		instantiateFarmerMarkets();
		instantiateAldi();

	}
	
	//This method will be called by UserMap
	public ArrayList<Market> getAllMarkets() {
		ArrayList<Market> allMarkets = new ArrayList<Market>();
		allMarkets.addAll(superMarkets);
		allMarkets.addAll(wawas);
		allMarkets.addAll(cornerStores);
		allMarkets.addAll(farmerMarkets);
		
		return allMarkets;
	}
	private void instantiateSuperMarketFoods() {

		Food apple = new Food("Apple",1, Calendar.JANUARY, Calendar.DECEMBER);
		Food banana = new Food("Banana",1, Calendar.JANUARY, Calendar.DECEMBER);
		Food carrot = new Food("Carrot",1, Calendar.JANUARY, Calendar.DECEMBER);
		superMarketFoods.add(apple);
		superMarketFoods.add(banana);
		superMarketFoods.add(carrot);
	}
	
	private void instantiateWawaFoods() {
		Food banana = new Food("Banana",1, Calendar.JANUARY, Calendar.DECEMBER);
		wawaFoods.add(banana);
	}

	private void instantiateCornerStoreFoods() {
		
	}
	
	private void instantiateFarmerMarketFoods() {
		
	}
	
	private void instantiateAldiFoods() {
		
	}
	
	private void instantiateSuperMarkets() {
		LatLng freshGrocerLocation = new LatLng(39.954499,-75.202864);
		LatLng supremeLocation = new LatLng(39.954792,-75.208733);
		Market freshGrocer = new Market("Fresh Grocer",superMarketFoods,freshGrocerLocation);
		Market supreme = new Market("Supreme Supermarket",superMarketFoods,supremeLocation);
		superMarkets.add(supreme);
		superMarkets.add(freshGrocer);
	}
	
	private void instantiateWawas() {
		LatLng 46thandChestnutWawaLocation = new LatLng(39.954687,-75.194799);
		Market 46thandChestnutWawa = new Market("46thandChestnutWawa",wawaFoods,46thandChestnutWawaLocation );
	}
	
	private void instantiateCornerStores() {
		
	}
	
	private void instantiateFarmerMarkets() {
		
	}
	
	private void instantiateAldi() {
		
	}
}
