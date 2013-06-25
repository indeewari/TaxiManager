package com.taxi.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SelectedCabData extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cab_data);
		
		EditText data = (EditText)findViewById(R.id.editText2);
		data.setText(CabServiceDisplay.cabDetails[0]+ "\n" + CabServiceDisplay.cabDetails[1]+ "\n"+CabServiceDisplay.cabDetails[2]+"\n");
		
		/*Intent findCab = new Intent(SelectedCabData.this, GetPathDistance.class);
		startActivity(findCab);*/
		Button callButton = (Button)findViewById(R.id.button1);
		callButton.setOnClickListener(this);
		
		
		
		
	}

	public void onClick(View v) {
		
		Intent call = new Intent(SelectedCabData.this, MakeACall.class);
		startActivity(call);
	}

}
