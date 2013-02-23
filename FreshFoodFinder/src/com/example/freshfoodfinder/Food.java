package com.example.freshfoodfinder;
import java.lang.String;
public class Food {
	private String name;
	public Food(String foodName) {
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
	
}
