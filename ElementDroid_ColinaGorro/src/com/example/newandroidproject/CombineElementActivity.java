package com.example.newandroidproject;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CombineElementActivity extends Activity {
	TextView numberOfElements1, numberOfElements2, newCombineElements;
	int valueElement1 = 0, valueElement2 = 0;
	String element1 = "", element2 = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combine_element);
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		
		numberOfElements1 = (TextView)findViewById(R.id.textView1);
		numberOfElements1.setText(""+0);
		numberOfElements2 = (TextView)findViewById(R.id.textView2);
		numberOfElements2.setText(""+0);
        NumberPicker numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        
        final Spinner elementSpinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapterSpinner1 = ArrayAdapter.createFromResource(this, R.array.element_arrays, R.drawable.spinner_item);
        adapterSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elementSpinner1.setAdapter(adapterSpinner1);
        
        
        final Spinner elementSpinner2 = (Spinner) findViewById(R.id.Spinner01);
        ArrayAdapter<CharSequence> adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.element_arrays, R.drawable.spinner_item);
        adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elementSpinner2.setAdapter(adapterSpinner2);
        
        numberPicker1.setMaxValue(20);       
        numberPicker1.setMinValue(0);         
        numberPicker1.setWrapSelectorWheel(true);
        numberPicker1.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	valueElement1 = newVal;
            	numberOfElements1.setText(""+newVal);
            }
        });
        
        numberPicker2.setMaxValue(20);       
        numberPicker2.setMinValue(0);         
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setOnValueChangedListener( new NumberPicker.
            OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int
                oldVal, int newVal) {
            	valueElement2 = newVal;
            	numberOfElements2.setText(""+newVal);
            }
        });
        
        elementSpinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
					int position, long id) {
				element1 = elementSpinner1.getSelectedItem().toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
        
        elementSpinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
					int position, long id) {
				element2 = elementSpinner2.getSelectedItem().toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
	}

	public void combineElements(View view) {
	    String newCompound= "";
	    newCombineElements = (TextView)findViewById(R.id.combine_element);
		if(valueElement1 > 0 && valueElement1 != 1){
			newCompound = newCompound+element1+""+valueElement1;
		}else if(valueElement1 == 1){
			newCompound = newCompound+""+element1;
		}
		
		if(valueElement2 > 0 && valueElement2 != 1){
			newCompound = newCompound+element2+""+valueElement2;
		}else if(valueElement2 == 1){
			newCompound = newCompound+""+element2;
		}
		
		if(valueElement2 > 0 && valueElement1 > 0){
			if(element1.equalsIgnoreCase(element2)){
				newCompound = ""+element1+""+(valueElement1+valueElement2);
			}
		}
		
		if(!newCompound.isEmpty()){
			newCombineElements.setText(newCompound);
		}else{
			Toast.makeText(getApplicationContext(), "Can't Combine", Toast.LENGTH_SHORT).show();
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.combine_element, menu);
		return true;
	}

}
