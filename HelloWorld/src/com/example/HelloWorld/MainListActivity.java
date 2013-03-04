package com.example.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/**
 * User: ryan
 * Date: 13-3-4
 * Time: 下午10:07
 */
public class MainListActivity extends Activity implements OnItemClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_list);

        ListView listView = (ListView) findViewById(R.id.main_list_view);
        String[] values = new String[] {"iOS","Android","Windows Phone", "Symbian"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.simplerow, values);
        listView.setAdapter(adapter);
        listView.setItemsCanFocus(true);

        WebViewClient client = new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                Log.d("MYAPP", "Page loaded");
            }

        };



        WebView webView = (WebView) findViewById(R.id.mainWebView);
        webView.loadUrl("http://baidu.com");
        webView.setWebViewClient(client);
        Toast.makeText(this, "Hello",1).show();
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
    }

    protected void onNewIntent(android.content.Intent intent) { /* compiled code */
        super.onNewIntent(intent);
    }

    protected void onSaveInstanceState(android.os.Bundle outState) { /* compiled code */
        super.onSaveInstanceState(outState);
    }

    protected void onPause() { /* compiled code */
        super.onPause();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s = view.toString() + " " + String.valueOf(i) + "  "+ String.valueOf(l);
        Log.d("Main", s);
        this.setTitle("You Click Item:" + String.valueOf(l));
//        Toast.makeText(MainListActivity.this, s,1).show();
        Toast.makeText(MainListActivity.this, "Hello",1).show();
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_CENTER:
                Toast.makeText(getBaseContext(), "Center was clicked",
                        Toast.LENGTH_LONG).show();
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                Toast.makeText(getBaseContext(), "Left arrow was clicked",
                        Toast.LENGTH_LONG).show();
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                Toast.makeText(getBaseContext(), "Right arrow was clicked",
                        Toast.LENGTH_LONG).show();
                break;
            case KeyEvent.KEYCODE_DPAD_UP:
                Toast.makeText(getBaseContext(), "Up arrow was clicked",
                        Toast.LENGTH_LONG).show();
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                Toast.makeText(getBaseContext(), "Down arrow was clicked",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

//    @Override
//    public void onClick(View view) {
//        Log.d("Main",view.toString());
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        //To change body of implemented methods use File | Settings | File Templates.
//
//        Log.d("Main", view.toString()+ " " +String.valueOf(i) + "  " +String.valueOf(l));
//    }
}