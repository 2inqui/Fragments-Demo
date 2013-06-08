package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FragmentA extends Fragment {

	static int REQUESTCODE_TEXT = 1;
	
	Button btnActivity;
	MainActivity activity;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		this.activity = (MainActivity) activity;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_a, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		btnActivity = (Button) getActivity().findViewById(R.id.button1);
		
		btnActivity.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				activity.FragmentClick();
			}
		});
	}

}
