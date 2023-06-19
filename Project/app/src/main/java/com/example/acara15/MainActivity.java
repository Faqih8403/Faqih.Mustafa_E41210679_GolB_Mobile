package com.example.acara15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recyler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void  addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Faqih Mustafa", "E41210679", "081234567891"));
    }
}