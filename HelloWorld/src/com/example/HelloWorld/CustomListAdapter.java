package com.example.HelloWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomListAdapter extends BaseAdapter {
	private Context context;   
	private LayoutInflater listContainer;           //视图容器   
	private ArrayList<HashMap<String, Object>> listItems;

	public CustomListAdapter(Context c,
			ArrayList<HashMap<String, Object>> items) {
		context = c;
        listContainer = LayoutInflater.from(context);   //创建视图容器并设置上下文   

		this.listItems = items;
	}

	@Override
	public int getCount() {
		return 2;//this.listItems.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView == null) {
            convertView = listContainer.inflate(R.layout.custom_row, null);   

		}
		
        return convertView;   
	}

}
