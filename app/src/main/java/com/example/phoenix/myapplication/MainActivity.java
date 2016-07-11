package com.example.phoenix.myapplication;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = new TextView(this);
        String fontPath = "fonts/";
        AssetManager manager = getAssets();
        Typeface tf = Typeface.createFromAsset(manager,fontPath);
        text.setTypeface(tf);
        //提交测试
        System.out.print("false");
    }
}
