package com.example.newandroidproject;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ScoreBoard extends ListActivity {

	public void onCreate(Bundle icicle) {
	    super.onCreate(icicle);
	    String[] values = new String[] { "Ken - 1000 points", "Kim - 900 points", "Kevin - 800 points",
	        "Glenn - 700 points", "Jan - 400 points","Renato - 300 points","Mark - 200 points"};
	    setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_score_board,R.id.name,values));
	    ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
	    
	    
	  }
	  @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    String item = (String) getListAdapter().getItem(position);
	    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	  }

}
