package com.example.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoreCard extends AppCompatActivity {
    ListView listView;
    MyAdapter myAdapter;
    ArrayList <Players> playersArrayList;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);
        //receiving intent
        intent=getIntent();
        playersArrayList=(ArrayList<Players>)intent.getSerializableExtra("playersArrayList");
        //creating an instance of adapter
        myAdapter=new MyAdapter(ScoreCard.this,playersArrayList);
        listView=findViewById(R.id.scoreList);
        //link list view and adapter
        listView.setAdapter(myAdapter);
    }
}
