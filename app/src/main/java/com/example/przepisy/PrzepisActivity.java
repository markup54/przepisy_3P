package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int id_kat=(int)getIntent()
                .getExtras()
                .get(ListaPrzepisowActivity.EXTRA_KAT);
        int id_przepisu = (int)getIntent()
                .getExtras()
                .get(ListaPrzepisowActivity.EXTRA_ID);
        ArrayList<Przepis> wybrane=
                RepozytoriumPrzepisow.getPrzepisy(id_kat);
        Przepis wyswietlanyPrzepis =
                wybrane.get(id_przepisu);
        TextView nazwaTextView =
                (TextView) findViewById(R.id.textView3);
        nazwaTextView.setText(wyswietlanyPrzepis.getNazwa());
        ImageView imageView=
                (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(wyswietlanyPrzepis.getIdZdjecia());
        imageView.setContentDescription(wyswietlanyPrzepis.getNazwa());
        TextView skladnikiTextView=
                (TextView) findViewById(R.id.textView4);
        skladnikiTextView.setText(wyswietlanyPrzepis.getSkladniki());

    }
}