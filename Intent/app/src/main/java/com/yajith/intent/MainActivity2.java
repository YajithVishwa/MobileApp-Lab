package com.yajith.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name,pass;
    private String names="",passs="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=(TextView)findViewById(R.id.textView2);
        pass=(TextView)findViewById(R.id.textView3);
        if(getIntent().getExtras()!=null)
        {
            names=getIntent().getStringExtra("name");
            passs=getIntent().getStringExtra("pass");
        }
        name.setText(names);
        pass.setText(passs);
    }
}