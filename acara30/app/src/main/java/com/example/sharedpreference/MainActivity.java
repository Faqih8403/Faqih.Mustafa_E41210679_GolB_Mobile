package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Deklarasi dan menginisialisasi variabel nama dengan label nama darai layout mainactivitu*/
        TextView nama = findViewById(R.id.tv_namaMain);

        /*menset label nama dengan data user sedang login dari preferences*/
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));

        /*menset status dan user yang sedang login menjadi default atau kosong di
        data preferences. kemudian menuju ke login activity */
        findViewById(R.id.button_LogoutMain).setOnClickListener((view) ->{
            //menghapus status login dan kembalo ke login activity
            Preferences.clearLoggedInUser(getBaseContext());
            startActivity(new Intent(getBaseContext(),LoginActivity.class));
            finish();
        });
    }
}