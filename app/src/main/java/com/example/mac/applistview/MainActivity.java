package com.example.mac.applistview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] nameArray = {"Kiwi", "Anggur", "Naga", "Semangka", "Strawberi", "Pisang", "Nanas", "Lemon"};

        final String[] infoArray = {
                "Buah yang berbentuk oval Dan Berwana Hijau",
                "Buah yang berbentuk bulat Dan Berwarna Ungu",
                "Buah yang berbentuk bulat memiliki sisik naga Dan Berwaarna Pink ke unguan",
                "Buah yang berbentuk oval Dan Berwarna Hijau dan Hitam bergaris garis",
                "Buah yang berbentuk hati Dan Berwarna Merah dan ada titik hitam",
                "Buah yang berbentuk batang yang memanjang dan ujung sedikit melengkung Dan Berwarna kuning",
                "Buah yang berbentuk lonjong seperti kerucut dan sedikit berduri Dan Berwarna kuning",
                "Buah yang berbentuk bulat lonjong Dan Berwarna kuning cerah."

        };

        Integer[] imageArray = {R.drawable.kiwi,
                R.drawable.anggur,
                R.drawable.naga,
                R.drawable.semangka,
                R.drawable.straw,
                R.drawable.pisang,
                R.drawable.nanas,
                R.drawable.lemon};

        ListView listView;
        CostumListAdapter whatever = new CostumListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ActivityDetail.class);
                String message = nameArray[position];
                intent.putExtra("fruits", message);
                startActivity(intent);
            }
        });
    }
}


