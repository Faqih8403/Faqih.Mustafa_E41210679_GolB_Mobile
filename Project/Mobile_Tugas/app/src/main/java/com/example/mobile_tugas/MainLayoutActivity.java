package com.example.mobile_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
    }

    public void linear(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, minggu2.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, Minggu3Activity.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, minggu3_FrameLayout.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, minggu4_TableLayout.class);
        startActivity(intent);
    }
    public void Material(View view) {
//        Intent intent = new Intent(MainLayoutActivity.this, .class);
//        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, minggu5_ScrollViewVertical.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, acara12_ScrollViewHorizontal.class);
        startActivity(intent);
    }
}