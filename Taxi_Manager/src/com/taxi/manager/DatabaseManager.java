package com.taxi.manager;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
//import org.ksoap2.transport.HttpTransportSE;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DatabaseManager extends Activity{
	
	
	public static final String TAG2 = "DatabaseManager";
	private String METHOD_NAME = "";
    // our webservice method name
    private String NAMESPACE = "http://tmserver.taxi,com";
    // Here package name in webservice with reverse order.
    private String SOAP_ACTION = NAMESPACE + METHOD_NAME;
    // NAMESPACE + method name
    private static final String URL = "http://124.43.75.48:8080/TMServer/services/TestOps?wsdl";
    
    //http://localhost:8080/TMServer/services/TestOps?wsdl

    // you must use ipaddress here, don’t use Hostname or localhost

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        //String city = "Matara";
     //   String im = "Galle Face";
        int number = 9;

        METHOD_NAME = "testingMehod";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("number", number);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
            
            Log.v(TAG2, "Response from database: " +result.toString() );
           // ((TextView) findViewById(R.id.txtCityLongitude)).setText(city
             //       + " Longitude is : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
           // ((TextView) findViewById(R.id.txtCityLongitude)).setText("ERROR:"
             //       + E.getClass().getName() + ":" + E.getMessage());
        }
        
        
        
        
        
        
        /*METHOD_NAME = "getLatitude_City";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("city", city);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
            //((TextView) findViewById(R.id.txtCityLatitude)).setText(city
              //      + " Latitude : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
           // ((TextView) findViewById(R.id.txtCityLatitude)).setText("ERROR:"
             //       + E.getClass().getName() + ":" + E.getMessage());
        }

        METHOD_NAME = "getLongitude_Im_Place";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("place", im);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
           // ((TextView) findViewById(R.id.txtIMLon)).setText(im
             //       + " Longitude : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
            //((TextView) findViewById(R.id.txtIMLon)).setText("ERROR:"
              //      + E.getClass().getName() + ":" + E.getMessage());
        }

        METHOD_NAME = "getLatitude_Im_Place";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("place", im);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
           // ((TextView) findViewById(R.id.txtIMLat)).setText(im
             //       + " Latitude : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
            //((TextView) findViewById(R.id.txtIMLat)).setText("ERROR:"
              //      + E.getClass().getName() + ":" + E.getMessage());
        }

        METHOD_NAME = "getCategory_Im_Place";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("place", im);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
           // ((TextView) findViewById(R.id.txtIMCat)).setText(im
             //       + " Category : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
          //  ((TextView) findViewById(R.id.txtIMCat)).setText("ERROR:"
            //        + E.getClass().getName() + ":" + E.getMessage());
        }

        METHOD_NAME = "getDescription_Im_Place";
        try {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("place", im);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            androidHttpTransport.call(SOAP_ACTION, envelope);
            Object result = envelope.getResponse();
            //((TextView) findViewById(R.id.txtIMDes)).setText(im
              //      + " Description : " + result.toString());

        } catch (Exception E) {
            E.printStackTrace();
           // ((TextView) findViewById(R.id.txtIMDes)).setText("ERROR:"
             //       + E.getClass().getName() + ":" + E.getMessage());
        }
        */
    }

}
