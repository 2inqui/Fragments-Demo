package com.example.calculadora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MyAdapter extends ArrayAdapter<String>{

	Context context;
	
	public MyAdapter(Context c){
		super(c, R.layout.list_item);
		context = c;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_item, parent, false);
//		TextView textView = (TextView) rowView.findViewById(R.id.label);
//		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//		textView.setText(values[position]);
		return rowView;
	}
	
	@Override
	public int getCount() {
		return 100;
	}
	
}
