package com.taxi.manager;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MakeACall extends Activity{
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_call);
        call();
    }
 
private void call() {
    try {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0716281185"));
        startActivity(callIntent);
    } catch (ActivityNotFoundException activityException) {
    	activityException.printStackTrace();
    }
}



}
