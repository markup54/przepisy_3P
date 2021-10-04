package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
                    }
                };
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(wybrany);
    }
}