package com.example.calculadora;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity{	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
	}
	
	public void FragmentClick(){
		FragmentManager manager = getFragmentManager();
		FragmentB fragment = (FragmentB) manager.findFragmentById(R.id.fragment_b);
		if(fragment == null){
			Toast.makeText(this, "No encontre el fragment", Toast.LENGTH_SHORT).show();	
		}else{
			fragment.setTexto("Fernando");	
		}
	}
	
}
