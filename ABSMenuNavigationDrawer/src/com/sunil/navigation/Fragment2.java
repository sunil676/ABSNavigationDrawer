package com.sunil.navigation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class Fragment2 extends SherlockFragment{

	private ImageView imageview=null;
	private TextView textname=null;
	private TextView textdescription=null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment2, container, false);
		
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
		
		textdescription.setText("This is Abhishek Tripathi, I am best friend of sunil gupta. We are the class batchmate.");
		return view;
	}
}
