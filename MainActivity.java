package com.example.homework1;

import com.example.homework1.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	Button add, remove, reset;
	int addRemove = 0;
	TextView display;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		add =(Button)findViewById(R.id.add);
		remove = (Button)findViewById(R.id.remove);
		display = (TextView)findViewById(R.id.view);
		reset = (Button)findViewById(R.id.reset);
		
		add.setOnClickListener(this);
		remove.setOnClickListener(this);
		reset.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
			case R.id.add:
				addRemove++;
				display.setText("Number of sheep are:"+addRemove);
				break;
			case R.id.remove:
				
				if(addRemove == 0)
					addRemove = 0;
				else
					addRemove--;
				display.setText("Number of sheep are:"+addRemove);
				break;

			case R.id.reset:
				addRemove = 0;
				display.setText("Number of sheep are:"+addRemove);
				};
		}
	}
	

