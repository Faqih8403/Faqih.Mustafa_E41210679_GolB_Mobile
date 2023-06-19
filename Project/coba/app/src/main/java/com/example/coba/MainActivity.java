package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linear(View view) {
        Intent intent = new Intent(MainActivity.this, minggu2_LinearLayout.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(MainActivity.this, minggu2_RelativeLayout.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(MainActivity.this, minggu3_ConstraintLayout.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(MainActivity.this, minggu3_FrameLayout.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(MainActivity.this, minggu4_TableLayout.class);
        startActivity(intent);
    }
    public void Material(View view) {
//        Intent intent = new Intent(MainLayoutActivity.this, .class);
//        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollViewVertical.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }
}