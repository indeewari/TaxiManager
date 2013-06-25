package com.taxi.manager;

import com.taxi.intern.Company;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CabServiceDisplay extends Activity implements OnClickListener{
	
	public static String[] cabDetails = new String[3]; 
	private Company[] cabData;
	private Bundle bundle;
	private String query;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.cabData = new Company[5];
		setQuery();
		connectToDatabase();
		setResult();
		//connect to the database
		//send query
		//get result
		//sort result
		//display result
		
		
		setContentView(R.layout.cb_service_display);
		
		Button cabOne = (Button)findViewById(R.id.buttonCabOne);
		cabOne.setOnClickListener(this);
		
		Button cabTwo = (Button)findViewById(R.id.buttonCabTwo);
		cabTwo.setOnClickListener(this);
		
		Button cabThree = (Button)findViewById(R.id.buttonCabThree);
		cabThree.setOnClickListener(this);
		
		Button cabFour = (Button)findViewById(R.id.buttoncabFour);
		cabFour.setOnClickListener(this);
		
		Button cabFive = (Button)findViewById(R.id.buttonCabFive);
		cabFive.setOnClickListener(this);
		
		
	}
	

	private void setResult() {
		// TODO Auto-generated method stub
		
	}


	private void connectToDatabase() {
		// TODO Auto-generated method stub
		
	}


	private void setQuery() {
		// TODO Auto-generated method stub
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.buttonCabOne){
			cabDetails[0]= "Kangaroo";
			cabDetails[1]= "500 Rs.";
			cabDetails[2]= "0771234567";
			
					}
		
		else if(v.getId()==R.id.buttonCabTwo){
			cabDetails[0]= "C Taxi";
			cabDetails[1]= "550 Rs.";
			cabDetails[2]= "0771234567";
		}
		
		else if(v.getId()==R.id.buttonCabThree){
			cabDetails[0]= "Rocket Way";
			cabDetails[1]= "560 Rs.";
			cabDetails[2]= "0771234567";
		}
		
		else if(v.getId()==R.id.buttoncabFour){
			cabDetails[0]= "Nishadi";
			cabDetails[1]= "580 Rs.";
			cabDetails[2]= "0771234567";
		}
		
		else if(v.getId()==R.id.buttonCabFive){
			cabDetails[0]= "Ceylon";
			cabDetails[1]= "600 Rs.";
			cabDetails[2]= "0771234567";
		}
		 
		startNewListener();
		
	}

	private void startNewListener() {
		// TODO Auto-generated method stub
		
		Intent cabDetails = new Intent(CabServiceDisplay.this, SelectedCabData.class);
		startActivity(cabDetails);
		
	}

}
