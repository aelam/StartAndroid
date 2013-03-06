package com.example.HelloWorld;

//import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//import android.view.View.OnClickListener;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;

//import java.util.concurrent.atomic.AtomicReference;
//import java.util.logging.Logger;


public class MainListActivity extends Activity implements OnItemClickListener {
	private final String LogTag = "MainListActivity";
	private final String RowObjectKey = "RowObjectKey";
	private final String RowDescKey = "RowDescKey";
	private ArrayList<HashMap<String, Object>> rowData;
	
	// 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_list);
        
        ListView listView = (ListView) findViewById(R.id.main_list_view);
        
//        float a = 1/0;
        
        rowData = getData("");
        
        ArrayAdapter<HashMap<String, Object>> adapter = new ArrayAdapter<HashMap<String, Object>>(this, R.layout.simplerow, rowData);
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(this);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        
    }

    
    protected ArrayList<HashMap<String, Object>> getData(String prefix) {
    	ArrayList<HashMap<String, Object>> rowData = new ArrayList<HashMap<String, Object>>();
    	
    
    	// 
        Intent intent0 = new Intent(this, FirstActivity.class);
        
        HashMap<String, Object> map0 = new HashMap<String,Object>();
        map0.put(RowDescKey, "基础控件");
    	map0.put(RowObjectKey, intent0);

    	rowData.add(map0);

    	Intent intent1 = new Intent(this, SecondActivity.class);
        
    	HashMap<String, Object> map1 = new HashMap<String,Object>();
    	map1.put(RowDescKey, "ListRow");
    	map1.put(RowObjectKey, intent1);
    	
    	rowData.add(map1);
    
    	// CustomListActivity
    	intent1 = new Intent(this, CustomListActivity.class);
        
    	map1 = new HashMap<String,Object>();
    	map1.put(RowDescKey, "CustomListActivity");
    	map1.put(RowObjectKey, intent1);
    	
    	rowData.add(map1);
    	
    	return rowData;
    
    }
    
    protected void onStart() {
        super.onStart();

    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onResume() {
     /* compiled code */
        super.onResume();
    }

    protected void onPostResume() { /* compiled code */
        super.onPostResume();
        Log.d(LogTag, "onPostResume");
    }

    protected void onNewIntent(android.content.Intent intent) { /* compiled code */
        super.onNewIntent(intent);
        Log.d(LogTag, "onNewIntent");

    }

    protected void onSaveInstanceState(android.os.Bundle outState) { /* compiled code */
        super.onSaveInstanceState(outState);
        Log.d(LogTag, "onSaveInstanceState");

    }

    protected void onPause() { /* compiled code */
        super.onPause();
        Log.d(LogTag, "onPause");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s = view.toString() + " i= " + String.valueOf(i) + " l= "+ String.valueOf(l);
        Log.d("Main", s);
        this.setTitle("You Click Item:" + String.valueOf(l));
        Toast.makeText(MainListActivity.this, s, Toast.LENGTH_LONG).show();

        HashMap<String, Object> data = rowData.get(i);
        Intent intent = (Intent) data.get(RowObjectKey);
        this.startActivity(intent);
        return;

    }
   
}