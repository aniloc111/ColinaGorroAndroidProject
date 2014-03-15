package com.example.newandroidproject;

import android.os.Bundle;
import android.media.*;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;

public class MainActivity extends Activity {
	private SoundPool sounds;
	private int sExplosion;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		   MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sample);
		    mp.start();
		setContentView(R.layout.activity_main);
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		
	}


	
	public void moveplay(View view) {
	    Intent intent = new Intent(this, MenuActivity.class);
	    startActivity(intent);
	}
}
