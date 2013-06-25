package com.taxi.intern;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.os.AsyncTask;
import android.util.Log;

public class ServerClient {

	public static final String TAG = "Server Client";
	final String NAMESPACE = "http://ws.apache.org/axis2";
    final String URL = "http://10.0.2.2:8080/TMServer/services/TestOps?wsdl";
    private int outputNumber;
    private int inputNumber;
    Company[] companyListArray ;
    
    public Company[] getCompanyList(float lat, float lng) {
    	
    	
  
    	new wsTask1().execute(lat, lng); // wsTask1 is assigned for the functionality
        Log.v(TAG, "Inside testOne ");
        
        try {
             Thread.sleep(2000); // samll delay until data receive - actually not a good practice, have to find alternative
        } catch (Exception e) {
        	
        	Log.v(TAG, "Caught exception in thred sleep ");
        }
        
        return companyListArray;
    }
    
    
    private class wsTask1 extends AsyncTask<Float, Void, Company[]> {

        // For the web service method: public String getLocations(String inputLocation))

		@Override
		protected Company[] doInBackground(Float... entry) {
			// TODO Auto-generated method stub
			
			companyListArray = new Company[5];
			ArrayList<Company> companyList = null;
			
			String METHOD = "getCompanyList";
            String SOAPACTION = NAMESPACE + METHOD;
            SoapObject request = new SoapObject(NAMESPACE, METHOD);
            
          //  String entry1= entry[0].toString();
            //String entry2= entry[1].toString();
            
            String entry1= "4.000000";
            String entry2= "5.000000";
            
            request.addProperty("lat", entry1);
            request.addProperty("lng", entry2);
            
            Log.v(TAG, "entry "+entry1);
            Log.v(TAG, "entry "+entry2);
            
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            
            try{
            	Log.v(TAG, "before call http transport");
            	            	
                androidHttpTransport.call(SOAPACTION, envelope);
                
                Log.v(TAG, "call http transport");
                
                Object response = (Object) envelope.getResponse();
                Log.v(TAG, "Got response");
                Gson gson = new Gson();
                
                String companyArrayString = response.toString();
                Log.v(TAG, "Response to string "+ companyArrayString);
                
                Type listType = new TypeToken<ArrayList<Company>>() {}.getType();
                
         
                companyList = gson.fromJson(companyArrayString, listType);
                
                         
                Log.v(TAG, "Output Number = " + companyList.get(0).getCompanyID());
                Log.v(TAG, "Output  = " + response.toString());
            }catch(Exception e){
            	Log.v(TAG, "Error in connecting database"+ e.toString());
            }
            int length = companyList.size();
            
            Log.v(TAG, "Size and limit " + length);
			
            int limit =0;
            if(length>=5){
            	limit = 5;
            }else if(length > 0){
            	limit = length;
            }
            
            for(int i = 0;i<limit;i++){
            	
            	try {
            		
            		if(companyList.get(i)!= null){
            			
            			Log.v(TAG, "Size and limit " + length +"  : "+ limit );
            			
            			companyListArray[i]= companyList.get(i);
            			Log.v(TAG, "Array component " + companyListArray[i].getContactNumber());
            			
					}
				} catch (NullPointerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            
            
            
			return companyListArray;
		}

		
    }
    
    
    
    
}
