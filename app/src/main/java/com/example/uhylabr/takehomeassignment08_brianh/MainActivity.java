package com.example.uhylabr.takehomeassignment08_brianh;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Questions> questions;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initalData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(questions, this));

    }

    private void initalData(){
        questions=new ArrayList<>();
        questions.add(new Questions(R.string.football, R.string.question_football, R.drawable.football, true));
        questions.add(new Questions(R.string.basketball, R.string.question_basketball, R.drawable.basketball, true));
        questions.add(new Questions(R.string.soccer, R.string.question_soccer, R.drawable.soccer, true));
        questions.add(new Questions(R.string.pingpong, R.string.question_pingpong, R.drawable.pingpong, true));
        questions.add(new Questions(R.string.baseball, R.string.question_baseball, R.drawable.baseball, true));
        questions.add(new Questions(R.string.tennis, R.string.question_tennis, R.drawable.tennis, false));
    }




}


