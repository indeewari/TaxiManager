package com.taxi.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.maps.MapActivity;
import com.taxi.intern.Company;
import com.taxi.intern.ServerClient;

public class GetPathDistance extends MapActivity{
	
	public static final String TAG = "MyActivity";
	
	private String requestCommand;
	private String origin;
	private String destination;
	private Bundle bundle;
	private int duration;
	private int distance;
	private float start_lat;
	private float start_lng;

	private Company[] result;
	
		
	
	
	public float getStart_lat() {
		return start_lat;
	}


	public float getStart_lng() {
		return start_lng;
	}


	public int getDuration() {
		return duration;
	}


	public String getRequestCommand() {
		return requestCommand;
	}


	private void setRequestCommand() {
		
		String basicCommand = "http://maps.googleapis.com/maps/api/directions/json?origin=";
		StringBuilder command = new StringBuilder();
		
		command.append(basicCommand);
		command.append(getOrigin());
		command.append("&destination=");
		command.append(getDestination());
		command.append("&sensor=false");
		
		requestCommand=command.toString();
		
		
		
		

	}


	public String getOrigin() {
		return origin;
	}


	private void setOrigin() {
		
		origin=bundle.getString("origin");
		
		Log.v(TAG, "origin =" + origin);
	}


	public String getDestination() {
		return destination;
	}


	private void setDestination() {
		destination=bundle.getString("destination");
		
		Log.v(TAG, "origin =" + destination);
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    bundle = this.getIntent().getExtras();
	    setOrigin();
	    setDestination();
	    setRequestCommand();
	    
	    Log.v(TAG, "Command sent =" + getRequestCommand());
	    
	    
	    
	    setContentView(R.layout.google_map);
	    getDistance();
	    
	    ServerClient serverClinet = new ServerClient();
	    result=serverClinet.getCompanyList(new Float(getStart_lat()), new Float(getStart_lng()));
	    Log.v(TAG, "Reply from database = " + result[0].getContactNumber());
	}
	    
	
	public void getDistance(){
		
		URL url = null;
		try {
			url = new URL(getRequestCommand());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) url.openConnection();
			Log.v(TAG, "where=" + "open connection");
			
			connection.setRequestMethod("GET");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.connect();
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		String line = null;
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = null;
		try {
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {int i=0;
			while((line = reader.readLine()) != null) {
				
				
				Log.v(TAG, i+" "+ line);
				i++;
				
			 builder.append(line);
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JSONObject json = null;

		try {
			 json = new JSONObject(builder.toString());
			 
			 Log.v(TAG, "where=" + "inside Jason");
			 
			 JSONArray routeObjectArray = json.getJSONArray("routes"); // pull out the "route" object 
			 
			 
			 for(int i=0; i < routeObjectArray.length(); i++) { // Loop over each each row
	                JSONObject row = routeObjectArray.getJSONObject(i); // Get row object
	                JSONArray elements = row.getJSONArray("legs"); // Get all elements for each row as an array

	                for(int j=0; j < elements.length(); j++) { // Iterate each element in the elements array
	                    JSONObject element =  elements.getJSONObject(j); // Get the element object
	                    JSONObject duration = element.getJSONObject("duration"); // Get duration sub object
	                    JSONObject distance = element.getJSONObject("distance"); // Get distance sub object
	                    JSONObject start_location = element.getJSONObject("start_location");
	                    
	                    
	                    this.duration=duration.getInt("value");
	                    this.distance=distance.getInt("value");
	                    this.start_lat=(float) start_location.getDouble("lat");
	                    this.start_lng=(float) start_location.getDouble("lng");

	                    Log.v(TAG, "Duration: " + duration.getInt("value"));
	                    Log.v(TAG, "Distance: " + distance.getInt("value"));
	                    Log.v(TAG, "lat: " + start_location.getDouble("lat"));
	                    Log.v(TAG, "lng: " + start_location.getDouble("lng"));
	                    
	                }
	                
			 }
			 
		
			 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
