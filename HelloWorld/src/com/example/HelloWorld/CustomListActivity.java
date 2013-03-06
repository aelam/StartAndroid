package com.example.HelloWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.LauncherActivity.ListItem;
import android.app.ListActivity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class CustomListActivity extends Activity {

    private ArrayList<HashMap<String, Object>> listItems;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_custom_list);
		// Show the Up button in the action bar.

		
		listItems = new ArrayList<HashMap<String, Object>>();
		ListView listView = (ListView ) findViewById(R.id.custom_list);
//
		
		
		HashMap<String, Object> map = new HashMap<String, Object>(); 
        map.put("title", "物品名称：");           //物品标题
        map.put("info", "good0");      //物品名称
        map.put("detail", "detail1");   //物品详情
        listItems.add(map);                         //添加一项

		CustomListAdapter listAdapter = new CustomListAdapter(this, listItems);

		listView.setAdapter(listAdapter);

		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
//	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
//	private void setupActionBar() {
//		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//			getActionBar().setDisplayHomeAsUpEnabled(true);
//		}
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.custom_list, menu);
		return true;
	}

//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
//		case android.R.id.home:
//			// This ID represents the Home or Up button. In the case of this
//			// activity, the Up button is shown. Use NavUtils to allow users
//			// to navigate up one level in the application structure. For
//			// more details, see the Navigation pattern on Android Design:
//			//
//			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
//			//
//			NavUtils.navigateUpFromSameTask(this);
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}

}
