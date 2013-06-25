package com.taxi.manager;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TaxiManagerActivity extends Activity implements OnClickListener {
	
	private String origin;
	private String destination;
	private Bundle bundle;
	public static final String TAG = "TaxiManagerActivity";
	
	
    /** Called when the activity is first created. */
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
		 
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        
	        Button b = (Button) findViewById(R.id.button1);
	        b.setOnClickListener(this);
	        
	        
	        
	    }

	public void onClick(View v) {
		

		if(v.getId()== R.id.button1 ){
			//Intent findCab = new Intent(TaxiManagerActivity.this, CabServiceDisplay.class);
			
			EditText from = (EditText) findViewById(R.id.editText1);
	        origin = from.getText().toString().trim();
	        
	        Log.v(TAG, "origin on click =" + origin);
	        
	        EditText to = (EditText) findViewById(R.id.editText2);
	        destination= to.getText().toString().trim();
	        
	        Log.v(TAG, "destination on click=" + destination);
			
			bundle = new Bundle();
			bundle.putString("origin", origin);
			bundle.putString("destination", destination);
			
			Intent findCab = new Intent(TaxiManagerActivity.this, GetPathDistance.class);
			
			findCab.putExtras(bundle);
			startActivityForResult(findCab, 0);
			//startActivity(findCab);
		}
		
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}
	
	
	
}