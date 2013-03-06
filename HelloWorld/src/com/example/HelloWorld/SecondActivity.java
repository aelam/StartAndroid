package com.example.HelloWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.SimpleAdapter;

public class SecondActivity extends ListActivity {

	// 测试ListView
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    List<Map<String, Object>> list;   
	    list = this.getListForSimpleAdapter();
	    
	    SimpleAdapter adapter = new SimpleAdapter(this, list,   
	    		R.layout.image_row,   
	    		       new String[] { "BigText", "LittleText", "img" },    
	    		new int[] { R.id.image_row_big_text,R.id.image_row_small_text, R.id.image_row_img1});   
	    setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
	
	
	
	private List<Map<String, Object>>getListForSimpleAdapter() {
	    List<Map<String,Object>> list=new ArrayList<Map<String, Object>>(3);   
        Map<String, Object> map = new HashMap<String, Object>();   
        map.put("BigText", "Android");   
        map.put("LittleText", "Google phone.Very long Text Google phone.Very long Text Google phone.Very long Text Google phone.Very long Text Google phone.Very long Text Google phone.Very long Text Google phone.Very long Text ");   
        map.put("img", R.drawable.prov);   
        list.add(map);   
 
        map = new HashMap<String, Object>();   
        map.put("BigText", "Lenovo");   
        map.put("LittleText", "Ophone");   
        map.put("img", R.drawable.prov);   
        list.add(map);   
 
        map = new HashMap<String, Object>();   
        map.put("BigText", "Droid");   
        map.put("LittleText", "Motorola");   
        map.put("img", R.drawable.prov);   
        list.add(map);   
 
       
        return list;   

}

}
