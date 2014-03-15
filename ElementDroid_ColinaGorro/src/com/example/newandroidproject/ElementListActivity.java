package com.example.newandroidproject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class ElementListActivity extends ListActivity {
	private List<Element> elementList= new ArrayList<Element>();
	static final String KEY_NAME = "name";
	static final String KEY_IMAGE = "image";
	static final String KEY_SYMBOL = "symbol";
	static final String KEY_DESC = "description";
	static final String KEY_ATOMIC_NUMBER = "atomic_number";
	static final String KEY_ATOMIC_WEIGHT = "atomic_weight";
	static final String KEY_COLOR = "color";
	static final String KEY_CLASSIFICATION = "classification";
	static final String KEY_MELTING_POINT = "melting_point";
	static final String KEY_BOILING_POINT = "boiling_point";
	static final String KEY_DENSITY_OF_SOLID = "density_of_solid";
	static final String KEY_POSITION = "position";
	
	static final int[] images = {
		R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5, R.drawable.e6, R.drawable.e7, R.drawable.e8, R.drawable.e9, R.drawable.e10,
		R.drawable.e11, R.drawable.e12, R.drawable.e13, R.drawable.e14, R.drawable.e15, R.drawable.e16, R.drawable.e17, R.drawable.e18, R.drawable.e19, R.drawable.e20,
		R.drawable.e21, R.drawable.e22, R.drawable.e23, R.drawable.e24, R.drawable.e25, R.drawable.e26, R.drawable.e27, R.drawable.e28, R.drawable.e29, R.drawable.e30};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ElementArrayAdapter elementArrayAdapter = new ElementArrayAdapter(this, generateData());
		setListAdapter(elementArrayAdapter);
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));

		ListView listView = getListView();
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				// getting values from selected ListItem
				String name = ((TextView) view.findViewById(R.id.element_name)).getText().toString();
				String classification = ((TextView) view.findViewById(R.id.element_classification)).getText().toString();
				int image = images[position];
				
				// Starting new intent
				Intent in = new Intent(getApplicationContext(), SelectedElement.class);
				in.putExtra(KEY_NAME, name);
				in.putExtra(KEY_POSITION, position);
				in.putExtra(KEY_IMAGE, image);
				in.putExtra(KEY_CLASSIFICATION, classification);
				startActivityForResult(in, 10);
			}
		});
	}
	
	public ArrayList<Element> generateData(){
		ArrayList<Element> elements = new ArrayList<Element>();
		elements.add(new Element(
				"Hydrogen",
				R.drawable.e1,
				"H",
				"Hydrogen is the lightest element. It is by far the most abundant element in the universe and makes up about about 90% of the universe by weight.",
				"1",
				"1.00794",
				"Colorless",
				"Non-metallic",
				"14.01 K",
				"20.28 K",
				"88 kg m^-3"
				));
		elements.add(new Element(
				"Helium",
				R.drawable.e2,
				"He",
				"Helium is the second most abundant element in the universe. It  is used in lighter than air balloons and while heavier than hydrogen, is far safer since helium does not burn.",
				"2",
				"4.00260",
				"Colorless",
				"Non-metallic",
				"0.95 K",
				"4.22 K",
				"214 kg m^-3"
				));
		elements.add(new Element(
				"Lithium",
				R.drawable.e3,
				"Li",
				"Lithium is a solid only about half as dense as water and lithium metal is the least dense metal. A freshly cut chunk of lithium is silvery, but tarnishes in a minute or so in air to give a grey surface.",
				"3",
				"6.941",
				"Silvery white/grey",
				"Metallic",
				"453.69 K",
				"1615.0 K",
				"535 kg m^-3"
				));
		elements.add(new Element(
				"Beryllium",
				R.drawable.e4,
				"Be",
				"Beryllium is a Group 2 (IIA) element. It is a metal and has a high melting point. At ordinary temperatures, beryllium resists oxidation in air. Beryllium compounds are very toxic.",
				"4",
				"9.01218",
				"Lead grey",
				"Metallic",
				"1560.0 K",
				"27420 K",
				"1848 kg m^-3"
				));
		elements.add(new Element(
				"Boron",
				R.drawable.e5,
				"B",
				"Boron is a Group 13 element that has properties which are borderline between metals and non-metals (semimetallic). It is a semiconductor rather than a metallic conductor. Chemically it is closer to silicon than to aluminium, gallium, indium, and thallium.",
				"5",
				"10.811",
				"Black",
				"Semi-metallic",
				"2349.0 K",
				"4200.0 K",
				"2460 kg m^-3"
				));
		elements.add(new Element(
				"Carbon",
				R.drawable.e6,
				"C",
				"Carbon is a Group 14 element and is distributed very widely in nature. It is found in abundance in the sun, stars, comets, and atmospheres of most planets.",
				"6",
				"12.0107",
				"graphite is black, diamond is colourless",
				"Non-metallic",
				"3800.0 K",
				"4300.0 K",
				"2267 kg m^-3"
				));
		elements.add(new Element(
				"Nitrogen",
				R.drawable.e7,
				"N",
				"Nitrogen is a Group 15 element. Nitrogen makes up about 78% of the atmosphere by volume but the atmosphere of Mars contains less than 3% nitrogen. Nitrogen gas is colourless, odourless, and generally inert. As a liquid it is also colourless and odourless.",
				"7",
				"14.0067",
				"Colorless",
				"Non-metallic",
				"63.05 K",
				"77.36 K",
				"1026 kg m^-3"
				));
		elements.add(new Element(
				"Oxygen",
				R.drawable.e8,
				"O",
				"Oxygen is a Group 16 element. Oxygen is the third most abundant element found in the sun, and it plays a part in the carbon-nitrogen cycle, one process responsible for stellar energy production.",
				"8",
				"15.9994",
				"Colourless as a gas; Liquid is pale blue",
				"Non-metallic",
				"54.8 K",
				"90.2 K",
				"1495 kg m^-3"
				));
		elements.add(new Element(
				"Fluorine",
				R.drawable.e9,
				"F",
				"Fluorine is a Group 17 element. Fluorine is the most electronegative and reactive of all elements. It is a pale yellow, corrosive gas, which reacts with practically all organic and inorganic substances.",
				"9",
				"18.99840",
				"Pale yellow",
				"Non-metallic",
				"53.53 K",
				"85.03 K",
				"1700  kg m^-3"
				));
		elements.add(new Element(
				"Neon",
				R.drawable.e10,
				"Ne",
				"Neon is a very inert element. Neon forms an unstable hydrate. In a vacuum discharge tube, neon glows reddish orange. Of all the rare gases, the discharge of neon is the most intense at ordinary voltages and currents. It is present in the atmosphere as 1 part in 65000.",
				"10",
				"20.1797",
				"Colorless",
				"Non-metallic",
				"24.56   K",
				"27.07  K",
				"1444  kg m^-3"
				));
		return elements;
	}
}
