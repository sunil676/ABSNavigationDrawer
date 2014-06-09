package com.sunil.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuListAdapter extends BaseAdapter{

	    private Context context;
	    private String[] mtitle;
	    private String[] msubTitle;
	    private int[] micon;
	    private LayoutInflater inflater;
	    
	 public  MenuListAdapter(Context context, String title[], String subtilte[], int icon[])
	 {
		 this.context=context;
		 this.mtitle=title;
		 this.msubTitle=subtilte;
		 this.micon=icon;
		 
	 }
	@Override
	public int getCount() {
		return mtitle.length;
	}

	@Override
	public Object getItem(int arg0) {
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup parent) {
		
		TextView title;
		TextView subtitle;
		ImageView icon;
		
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.drawer_list_item, parent, false);
       
        title = (TextView) itemView.findViewById(R.id.title);
        subtitle = (TextView) itemView.findViewById(R.id.subtitle);
        icon = (ImageView) itemView.findViewById(R.id.icon);
        
        title.setText(mtitle[position]);
        subtitle.setText(msubTitle[position]);
        icon.setImageResource(micon[position]);
 
        return itemView;
		
	}

}
