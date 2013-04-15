package com.example.button_test;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class TestButton extends Activity{
	private Button but;
	private Button add;
	//dfdfdfkjdkfjdfkjdfkd
	private LinearLayout lin;
	private static int count=1;
	private ArrayList<Button>list=new ArrayList<Button>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_button);
        lin=(LinearLayout)findViewById(R.id.ll01);
        add=(Button)findViewById(R.id.add01);
        add.setOnClickListener(addBut);
        crButtons();
      
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_test_button, menu);
        return true;
    }
    public OnClickListener addBut=new OnClickListener(){

		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
    	
    };
    
    public void crButtons(){
    	for(int i=0;i<5;i++){
    	Log.e("rtrreeeeZUZZZZZeeeeeee", "URAAAAAAAAAAAAAAAA");
		but=new Button(TestButton.this);
		but.setText("Hello wolrd");
		but.setId(count);
		count++;
		lin.addView(but);
		list.add(but);
    	}
    	for(int j=0;j<list.size();j++){
    		list.get(j).setOnClickListener(getHello);
    	}
		//but.setOnClickListener(getHello);
    	
    	
    }
  
    
    public OnClickListener getHello=new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Log.e("rtrreeeeeeeeeee", "URAAAAAAAAAAAA55555555555AAAA       "+v.getId());
			
			Intent in=new Intent(v.getContext(),Mudis.class);
			
			in.putExtra("Senol", "HALLLO NOCH MAL");
			in.putExtra("Senol2", "TSCHUESS");
			setResult(RESULT_OK, in);
			startActivity(in);
		}
	};

	
}
