package com.example.freshfoodfinder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
public class FirstView extends View {
	public ArrayList<Food> listOfFoods = new ArrayList<Food>();
	public FirstView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	public FirstView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init();
	}

	public FirstView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		init();
	}

	protected void init(){
		Food banana  = new Food("banana");
		Food apple = new Food("apple");
		Food carrot = new Food("carrot");
	}
}
