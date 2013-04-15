package com.example.button_test;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Mudis extends Activity {
	
	private TextView tv1;
	private TextView tv2;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudis);
        tv1=(TextView)findViewById(R.id.tv01);
        tv2=(TextView)findViewById(R.id.tv02);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Senol");
            String value2=extras.getString("Senol2");
            tv1.setText(value);
            tv2.setText(value2);
        }

	}
	
	 

}
