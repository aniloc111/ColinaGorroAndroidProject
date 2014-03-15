package com.example.newandroidproject;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ExpertMode extends Activity {

	
	 private TextView timerValue;

     private long startTime = 0L;

     private Handler customHandler = new Handler();

     long timeInMilliseconds = 0L;

     long timeSwapBuff = 0L;
 
     long updatedTime = 0L;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expert_mode);
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		 timerValue = (TextView) findViewById(R.id.timer);
		 startTime = SystemClock.uptimeMillis();
		 customHandler.postDelayed(updateTimerThread, 0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expert_mode, menu);
		return true;
	}

	 private Runnable updateTimerThread = new Runnable() {
		 
         public void run() {
 
  
 
             timeInMilliseconds = SystemClock.uptimeMillis() - startTime;
 
  
 
             updatedTime = timeSwapBuff + timeInMilliseconds;
 
  
 
             int secs = (int) (updatedTime / 1000);
 
             int mins = secs / 60;
 
             secs = secs % 60;
 
             int milliseconds = (int) (updatedTime % 1000);
 
             timerValue.setText("" + mins + ":"
 
                     + String.format("%02d", secs) + ":"
 
                     + String.format("%03d", milliseconds));
 
             customHandler.postDelayed(this,0);
 
         }

     };
}
