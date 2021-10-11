package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_ID_KAT ="id_kat";
    public static final String EXTRA_NAZWA_KAT ="nazwa_kat";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener wybrany =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(
                            AdapterView<?> adapterView,
                            View view,
                            int i,
                            long l) {
                        Toast.makeText(
                                MainActivity.this,
                                "klinieto "+Integer.toString(i),
                                Toast.LENGTH_SHORT)
                                .show();
                        Intent intent = new Intent(MainActivity.this,
                                ListaPrzepisowActivity.class);
                        intent.putExtra(EXTRA_ID_KAT,i);
                        String nazwa_kat = adapterView.getItemAtPosition(i).toString();
                        intent.putExtra(EXTRA_NAZWA_KAT,nazwa_kat);
                        startActivity(intent);
                    }
                };
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(wybrany);
    }
}