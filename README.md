ABSNavigationDrawer
===================
This is the android project for Action BarSherlock slid navigation.
ActionBarSherlock is an extension of the support library designed to facilitate the use of the action bar design pattern across all versions of Android with a single API.

The library will automatically use the native action bar when appropriate or will automatically wrap a custom implementation around your layouts. This allows you to easily develop an application with an action bar for every version of Android from 2.x and up


XML:

<android.support.v4.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/drawer_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >
 
    <FrameLayout
        android:id="@+id/content_frame"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
 
    <ListView
        android:id="@+id/listview_drawer"
        android:layout_width="240dp"
        android:layout_height="match_parent"
        android:layout_gravity="start"
        android:background="#111"
        android:choiceMode="singleChoice"
        android:divider="@android:color/transparent"
        android:dividerHeight="0dp" />
 
</android.support.v4.widget.DrawerLayout>


JAVA:
 
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
      
	}

LINK:

MyBlog tutorial:

http://sunil-android.blogspot.in/2013/09/slide-menu-navigation-drawer-in-android.html


Copyright 2014 Sunil Gupta

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
