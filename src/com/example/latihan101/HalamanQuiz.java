package com.example.latihan101;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HalamanQuiz extends Activity {
	Button Btn1,Btn2;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanquiz);
    
        Btn1=(Button)findViewById(R.id.AnakAnjing);
        Btn2=(Button)findViewById(R.id.SayurKol);
        
        Btn1.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1= new Intent(HalamanQuiz.this,Quiz1.class);
				startActivity(intent1);			
				}
		});
	
        Btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(HalamanQuiz.this,Quiz2.class);
				startActivity(intent2);
			}
		});
	}
    	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
