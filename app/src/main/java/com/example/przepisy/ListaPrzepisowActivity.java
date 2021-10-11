package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaPrzepisowActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String nazwa_kat=getIntent()
                .getExtras()
                .get(MainActivity.EXTRA_NAZWA_KAT)
                .toString();
        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(nazwa_kat);
    }
}