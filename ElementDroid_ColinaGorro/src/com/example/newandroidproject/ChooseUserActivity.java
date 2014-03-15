package com.example.newandroidproject;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ChooseUserActivity extends ListActivity {
	public String type;
	  public void onCreate(Bundle icicle) {
		    super.onCreate(icicle);
		    ActionBar actionBar = getActionBar();
			actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		    String[] values = new String[] { "Add new user","Ken", "Kim", "Kevin",
			        "Glenn", "Jan","Renato","Mark"};
		    
		    Intent intent = getIntent();
		    
	        // 2. get message value from intent
	        this.type = intent.getStringExtra("type");
		    
		    setListAdapter(new ChooseUserAdapter(this, values));
		    
		    
     }


	 @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    String item = (String) getListAdapter().getItem(position);
	    if(item=="Add new user")
	    {
	    	Intent intentAddUser = new Intent(this, AddUser.class);
	        startActivity(intentAddUser);
	    }
	    else
	    {
	    	if(this.type.equals("Challenge"))
	    	{
	    		Intent intentChallenge = new Intent(this, ChallengeMode.class);
	    		startActivity(intentChallenge);
	    	}
	    	else if(this.type.equals("Relax"))
	    	{
	    		Intent intentChallenge = new Intent(this, RelaxModeActivity.class);
	    		startActivity(intentChallenge);
	    	}
	    	
	    	else if(this.type.equals("Expert"))
	    	{
	    		Intent intentChallenge = new Intent(this, ExpertMode.class);
	    		startActivity(intentChallenge);
	    	}
	    	
	    	else if(this.type.equals("Master"))
	    	{
	    		Intent intentChallenge = new Intent(this, MasterActivity.class);
	    		startActivity(intentChallenge);
	    	}
	    	
	    
	    }
	  }

}
