package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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
        int id = (int) getIntent()
                .getExtras()
                .get(MainActivity.EXTRA_ID_KAT);
        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(nazwa_kat);
        //w listView chcemy
        //wypisac nazwy przepisów z danej kategorii
        //a w repozytorium mamy listę wszystkich
        ArrayAdapter <Przepis> przepisArrayAdapter=
                new ArrayAdapter<Przepis>(
                        this,
                        android.R.layout.simple_list_item_1,
                        RepozytoriumPrzepisow.getPrzepisy(id)
                );
        ListView listView =(ListView) findViewById(R.id.listView2);
        listView.setAdapter(przepisArrayAdapter);


        AdapterView.OnItemClickListener itemClickListener
                =new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(
                    AdapterView<?> adapterView,
                    View view,
                    int i,
                    long l) {
                Intent intent = new Intent(
                        ListaPrzepisowActivity.this,
                        PrzepisActivity.class
                );

                startActivity(intent);
                }

            };
        listView
                .setOnItemClickListener(itemClickListener);
    }
}
