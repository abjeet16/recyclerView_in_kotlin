package com.example.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView:RecyclerView;
    lateinit var arrayList:ArrayList<element>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView);
        arrayList = ArrayList<element>();

        arrayList.add(element(R.drawable.chathub,"abjeet","bca"));

        recyclerView.layoutManager = LinearLayoutManager(this)

        var recyclerAdapter = adapter(this,arrayList);

        recyclerView.adapter = recyclerAdapter;

    }
}