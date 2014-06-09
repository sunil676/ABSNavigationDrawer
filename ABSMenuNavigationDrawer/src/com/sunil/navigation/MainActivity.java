package com.sunil.navigation;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockFragmentActivity implements OnItemClickListener{

	private DrawerLayout drawlayout=null;
	private ListView listview=null;
	private ActionBarDrawerToggle actbardrawertoggle=null;
	
	private String[] myfriendname=null;
    private String[] myfriendnickname=null;
    private int[] photo=null;
    //Fragment fragment1 = new Fragment1();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 myfriendname = new String[] { "Sunil Gupta", "Abhishek Tripathi","Sandeep Pal", "Amit Verma" };
         myfriendnickname = new String[] { "sunil android", "Abhi cool","Sandy duffer", "Budhiya jokar"};
         photo = new int[] { R.drawable.sunil, R.drawable.abhi, R.drawable.sandy, R.drawable.amit};
         
         drawlayout = (DrawerLayout)findViewById(R.id.drawer_layout);
         listview = (ListView) findViewById(R.id.listview_drawer);
         
         getSupportActionBar().setHomeButtonEnabled(true);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setDisplayShowHomeEnabled(true);
         getSupportActionBar().setDisplayShowTitleEnabled(true);
         
         drawlayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
         drawlayout.setBackgroundColor(Color.WHITE);
         
         MenuListAdapter menuadapter=new MenuListAdapter(getApplicationContext(), myfriendname, myfriendnickname, photo); 
         listview.setAdapter(menuadapter);
         
         actbardrawertoggle= new ActionBarDrawerToggle(this, drawlayout, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close)
            {
        	 public void onDrawerClosed(View view) {
 				super.onDrawerClosed(view);
 			}

 			public void onDrawerOpened(View drawerView) {
 				super.onDrawerOpened(drawerView);
 			
 			}
        	 
         };
         drawlayout.setDrawerListener(actbardrawertoggle);
         
         listview.setOnItemClickListener(this);
        
      /*   if (savedInstanceState == null) {
             selectItem(0);
         }*/
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		actbardrawertoggle.syncState();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		actbardrawertoggle.onConfigurationChanged(newConfig);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		selectItem(position);
		
	}
	
	
	 private void selectItem(int position) {
		 
	        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
	       
	        // Locate Position
	        switch (position) {
	        case 0:
	        	Fragment1 fragment1=new Fragment1();
	            ft.replace(R.id.content_frame, fragment1);
	            Bundle b = new Bundle();
	            b.putString("name",myfriendname[position]);
	            b.putInt("photo",photo[position]);
	            fragment1.setArguments(b);
	            break;
	        case 1:
	        	Fragment2 fragment2=new Fragment2();
	            ft.replace(R.id.content_frame, fragment2);
	            Bundle b1 = new Bundle();
	            b1.putString("name",myfriendname[position]);
	            b1.putInt("photo",photo[position]);
	            fragment2.setArguments(b1);
	            break;
	        case 2:
	        	Fragment3 fragment3=new Fragment3();
	            ft.replace(R.id.content_frame, fragment3);
	            Bundle b2 = new Bundle();
	            b2.putString("name",myfriendname[position]);
	            b2.putInt("photo",photo[position]);
	            fragment3.setArguments(b2);
	            break;
	        case 3:
	        	Fragment4 fragment4=new Fragment4();
	            ft.replace(R.id.content_frame, fragment4);
	            Bundle b3 = new Bundle();
	            b3.putString("name",myfriendname[position]);
	            b3.putInt("photo",photo[position]);
	            fragment4.setArguments(b3);
	            break;
	        }
	        ft.commit();
	        listview.setItemChecked(position, true);
	        setTitle(myfriendname[position]);
	        drawlayout.closeDrawer(listview);
	    }
	 
	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		 if(item.getItemId()==android.R.id.home)
		 {
			 if(drawlayout.isDrawerOpen(listview))
			 {
				 drawlayout.closeDrawer(listview);
			 }
			 else {
				drawlayout.openDrawer(listview);
			}
		 }
		return super.onOptionsItemSelected(item);
	}	 

}
