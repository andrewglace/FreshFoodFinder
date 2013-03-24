package com.example.freshfoodfinder;

import java.util.ArrayList;

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
	
	public MarketManager() {
		superMarketFoods = new ArrayList<Food>();
		wawaFoods = new ArrayList<Food>();
		cornerStoreFoods = new ArrayList<Food>();
		farmerMarketFoods = new ArrayList<Food>();
		aldiFoods = new ArrayList<Food>();
		
		
		instantiateSuperMarketFoodList();

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
	private void instantiateSuperMarketFoodList() {

	}
	
	private void instantiateWawaFoods() {
		
	}

	private void instantiateCornerStoreFoods() {
		
	}
	
	private void instantiateFarmerMarketFoods() {
		
	}
	
	private void instantiateAldiFoods() {
		
	}
}
