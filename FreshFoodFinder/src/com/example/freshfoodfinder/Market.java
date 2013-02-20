package com.example.freshfoodfinder;
import java.util.ArrayList;

import com.google.android.maps.GeoPoint;
public class Market {
	private String name;
	private ArrayList<Food> foodSoldHere;
	private GeoPoint location;
	public Market(String marketName, ArrayList<Food> foods, GeoPoint whereIsThisMarket) {
		name=marketName;
		location=whereIsThisMarket;
		foodSoldHere = foods;
	}
	public String getName(){
		return name;
	}
	public ArrayList<Food> getFoods(){
		return foodSoldHere;
	}
	public Boolean hasFood(Food aFood){
		if(foodSoldHere.contains(aFood)){
			return true;
		}
		return false;
	}
	public GeoPoint getX(){
		return location;
	}
	public void addFood(Food FoodIn){
		 foodSoldHere.add(FoodIn);
	}
	public void removeFood(Food FoodIn){
		 foodSoldHere.remove(FoodIn);
	}
	@Override
	public int hashCode(){		
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		if(o.hashCode()==hashCode()){
			return true;
		}
		return false;
	}
	
}
