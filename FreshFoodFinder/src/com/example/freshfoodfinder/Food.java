package com.example.freshfoodfinder;
import java.util.Calendar;

import android.os.Parcel;
import android.os.Parcelable;
public class Food implements Parcelable {
	private String name;
	private int foodId;
	private Calendar seasonStart;
	private Calendar seasonEnd;
	
	public static final int FOOD_FRUIT = 1;
	public static final int FOOD_VEG = 2;
	
	
	
	public Food(String foodName, int foodType, int seasonStart, int seasonEnd) {
		name=foodName;
	}
	public String getName(){
		return name;
	}
	@Override
	public int hashCode(){		
		return name.hashCode();
	}
	@Override
	public String toString() {	
		return name.toString();
	}
	@Override
	public boolean equals(Object o){
		if(o.hashCode()==hashCode()){
			return true;
		}
		return false;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
