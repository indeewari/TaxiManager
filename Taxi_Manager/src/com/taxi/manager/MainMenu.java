package com.taxi.manager;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenu extends ListActivity{
	
	String classes[] = {"TaxiManagerActivity","MyTrips","Maps"};
	String listItems[] = {"Hail a Cab !","My Trips","Go to Maps"};

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String clickedItem = classes[position];
		
		try {
			Class instantClass = Class.forName("com.taxi.manager."+clickedItem);
			Intent instantIntent = new Intent(MainMenu.this,instantClass);
			startActivity(instantIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MainMenu.this, android.R.layout.simple_list_item_1, listItems));
	}
	
	

}
