package com.example.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        Button firstButton = (Button)findViewById(R.id.firstButton);
//        firstButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button button = (Button)v;
//                Toast.makeText(MyActivity.this, button.getText(), 1).show();
//            }
//        });

        Button secondButton = (Button)findViewById(R.id.secondButton);

//        secondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button button = (Button)v;
//                Toast.makeText(MyActivity.this, button.getText(), 1).show();
//            }
//        });

        OnClickListener buttonClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button)v;
                Toast.makeText(MyActivity.this, button.getText(), 1).show();
            }
        };

        firstButton.setOnClickListener(buttonClickListener);
        secondButton.setOnClickListener(buttonClickListener);
    }
}
