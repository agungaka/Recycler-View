package com.akaprod.agung.rview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<kumpulanData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<kumpulanData>();

        data.add(new kumpulanData("Agung", "Kurniawan"));
        data.add(new kumpulanData("Earth", "Shaker"));
        data.add(new kumpulanData("Mee", "Pawn"));
        data.add(new kumpulanData("Shadow", "Shaman"));
        data.add(new kumpulanData("Mag", "Nus"));
        data.add(new kumpulanData("Bowo", "Tiktok"));
        data.add(new kumpulanData("Pamannya", "Bowo"));
        data.add(new kumpulanData("Efek", "Kamera"));
        data.add(new kumpulanData("Gitar", "Klasik"));

        mAdapter = new myAdapter(this,data);

        recyclerView.setAdapter(mAdapter);
    }
}
