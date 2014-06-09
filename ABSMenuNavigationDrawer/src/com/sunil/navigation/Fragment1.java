package com.sunil.navigation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class Fragment1 extends SherlockFragment{

	private ImageView imageview=null;
	private TextView textname=null;
	private TextView textdescription=null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment1, container, false);
		
		imageview=(ImageView)view.findViewById(R.id.imageView_pic);
		textname=(TextView)view.findViewById(R.id.textView_name);
		textdescription=(TextView)view.findViewById(R.id.textView_descroption);
		
		textname.setTextColor(Color.BLACK);
		textdescription.setTextColor(Color.BLACK);
		
		Bundle bundle=this.getArguments(); 
		if(bundle != null)
		{
			String name=bundle.getString("name");
			int pic=bundle.getInt("photo");
			textname.setText(name);
			imageview.setImageResource(pic);
		}
		
		textdescription.setText("I'm currently working as Android developer,  interested in a wide-range of technology topics, including programming languages,  opensource and any other cool technology that catches my eye. I love developing apps for Android, designing and coding.");
		return view;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
	}
}
