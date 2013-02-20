package com.example.freshfoodfinder;
import java.lang.String;
import java.util.ArrayList;
public class Market {
	private String name;
	private ArrayList<Food> foodSoldHere;
	private double xCoOrd;
	private double yCoOrd;
	public Market(String marketName, ArrayList<Food> foods, double xCoordinate, double yCoordinate) {
		name=marketName;
		xCoOrd = xCoordinate;
		yCoOrd = yCoordinate;
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
	public double getX(){
		return xCoOrd;
	}
	public double getY(){
		return yCoOrd;
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
