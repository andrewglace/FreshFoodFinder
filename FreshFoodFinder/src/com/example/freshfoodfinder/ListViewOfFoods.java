package com.example.freshfoodfinder;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListViewOfFoods extends ListView {

	public ListViewOfFoods(Context context) {
		super(context);
		init();
	}

	public ListViewOfFoods(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ListViewOfFoods(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	protected void init(){
	}
}
