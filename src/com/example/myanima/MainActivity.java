package com.example.myanima;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends  Activity {

	private TextView myText=null;
	private Button btnTest=null;
	private Button btnReset=null;
	private Animation  anima;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myText=(TextView)findViewById(R.id.myText);
		btnTest=(Button)findViewById(R.id.btnTest);
		btnReset=(Button)findViewById(R.id.btnReset);
		
		anima=AnimationUtils.loadAnimation(this, R.anim.myanima);
		btnTest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub 
				myText.startAnimation(anima);
				myText.setVisibility(View.GONE);
			}
		});
		
		btnReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myText.setText("123321");
				myText.setVisibility(View.VISIBLE);
			}
		});
		
	}

 

	 
}
