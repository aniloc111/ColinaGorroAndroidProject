package com.example.newandroidproject;

import com.example.newandroidproject.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseUserAdapter  extends ArrayAdapter<String> {
		
	private final Context context;
	private final String[] values;

	public ChooseUserAdapter(Context context, String[] values) {
		super(context, R.layout.activity_choose_user, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.activity_choose_user, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.name);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.list_image);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		if (s.equals("Add new user")) {
			imageView.setImageResource(R.drawable.adduser);
		} else{
			imageView.setImageResource(R.drawable.person);
		} 
		return rowView;
	}
}
