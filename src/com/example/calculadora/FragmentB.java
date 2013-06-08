package com.example.calculadora;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FragmentB extends Fragment{

	
	
	EditText etTexto;
	Button btn;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_b, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		etTexto = (EditText) getActivity().findViewById(R.id.layout_et);
	}
	
	public void setTexto(String texto){
		etTexto.setText(texto);
	}
	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.fragment_b);
//		
//		etTexto = (EditText) findViewById(R.id.layout_et);
//		btn = (Button) findViewById(R.id.layout_button);
//		
//		btn.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				
//				Intent i = getIntent();
//				i.putExtra("texto", etTexto.getText().toString());
//				setResult(RESULT_OK, i);
//				finish();
//			}
//		});
//		
//		if(savedInstanceState != null){
//			etTexto.setText(savedInstanceState.getString("textfieldvalue"));
//		}
//		
//	}
//	
//	@Override
//	protected void onSaveInstanceState(Bundle outState) {
//		super.onSaveInstanceState(outState);
//		outState.putString("textfieldvalue", etTexto.getText().toString());
//	}
	
}
