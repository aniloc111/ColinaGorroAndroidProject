package com.example.newandroidproject;

import com.example.newandroidproject.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public MobileArrayAdapter(Context context, String[] values) {
		super(context, R.layout.menulayout, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.menulayout, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.title);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.list_image);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		if (s.equals("Periodic Table")) {
			imageView.setImageResource(R.drawable.launcher);
		} else if (s.equals("Let's Combine")) {
			imageView.setImageResource(R.drawable.p1);
		} else if (s.equals("Relax Mode")) {
			imageView.setImageResource(R.drawable.relax);
		} else if (s.equals("Challenge Mode")) {
			imageView.setImageResource(R.drawable.challenge);
		}
		else if (s.equals("Expert Mode")) {
			imageView.setImageResource(R.drawable.expert);
		}
		else if (s.equals("Score Board")) {
			imageView.setImageResource(R.drawable.scoreboard);
		}else if(s.equals("Help")){
			imageView.setImageResource(R.drawable.help);
		}
		else if(s.equals("Master Mode")){
			imageView.setImageResource(R.drawable.master);
		}
		return rowView;
	}
}
