package com.example.newandroidproject;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    String[] values = new String[] { "Periodic Table", "Let's Combine", "Relax Mode",
        "Challenge Mode", "Expert Mode","Master Mode","Score Board","Help"};
    
    setListAdapter(new MobileArrayAdapter(this, values));
    ActionBar actionBar = getActionBar();
	actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
    
  }

  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    String item = (String) getListAdapter().getItem(position);    
    if(item=="Score Board")
    {
    	Intent intentScoreBoard = new Intent(this, ScoreBoard.class);
        startActivity(intentScoreBoard);
    }
    else if(item == "Relax Mode" || item == "Challenge Mode" || item == "Expert Mode" || item == "Master Mode")
    {
    	Intent intentChooseUser = new Intent(this, ChooseUserActivity.class);
    	
    	if(item== "Relax Mode")
    			intentChooseUser.putExtra("type", "Relax");
    	else if(item== "Challenge Mode")
    			intentChooseUser.putExtra("type", "Challenge");
    	else if(item== "Expert Mode")
			intentChooseUser.putExtra("type", "Expert");
    	else if(item == "Master Mode"){
    		intentChooseUser.putExtra("type", "Master");
//        	Intent master = new Intent(this, MasterActivity.class);
//        	startActivity(master);
        	
        }
    	
    	startActivity(intentChooseUser);
    }else if (item == "Periodic Table"){
    	Intent periodicTable = new Intent(this, ElementListActivity.class);
    	startActivity(periodicTable);
    } else if(item == "Help"){
    	Intent helpElement = new Intent(this, ElementHelp.class);
    	startActivity(helpElement);
    } else if(item == "Let's Combine"){
    	Intent letsCombine = new Intent(this, CombineElementActivity.class);
    	startActivity(letsCombine);
    	
    }
  }

}
