package com.example.newandroidproject;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ElementArrayAdapter extends ArrayAdapter<Element> {
	private final Context context;
	private ArrayList<Element> elementsArrayList;

	public ElementArrayAdapter(Context context, ArrayList<Element> elementsArrayList) {
		super(context, R.layout.element_row_layout, elementsArrayList);
		this.context = context;
		this.elementsArrayList = elementsArrayList;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = (convertView == null)?inflater.inflate(R.layout.element_row_layout, parent, false):convertView;

		
		TextView elementNameView = (TextView)rowView.findViewById(R.id.element_name);
		TextView elementClassificationView = (TextView)rowView.findViewById(R.id.element_classification);
		ImageView elementImageView = (ImageView)rowView.findViewById(R.id.element_icon);
		
		elementNameView.setText(elementsArrayList.get(position).getName());
		elementClassificationView.setText(elementsArrayList.get(position).getClassification());
		elementImageView.setImageResource(elementsArrayList.get(position).getImage());
		
		return rowView;
	}
}
