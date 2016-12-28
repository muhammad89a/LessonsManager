package com.example.mohammed.lessonsmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public List<Lesson> lessonsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LessonAdapter mAdapter;
    private Button AddButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);

        AddButton = (Button) findViewById(R.id.additem);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new LessonAdapter(lessonsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Lesson lesson = lessonsList.get(position);
                Toast.makeText(getApplicationContext(), lesson.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Intent myIntent = new Intent(MainActivity.this, info_activity.class);

                Lesson lesson = lessonsList.get(position);
                myIntent.putExtra("title", lesson.getTitle());
                myIntent.putExtra("subtitle", lesson.getDetail());
                myIntent.putExtra("info", lesson.getinfo());
                myIntent.putExtra("date", lesson.getDate());

              //  myIntent.putExtra("list",lessonsList.toString());
                MainActivity.this.startActivity(myIntent);

            }
        }));

        prepareLessonData();
        AddButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, info_activity.class);
                myIntent.putExtra("where", "0");
                int size=lessonsList.size();
                myIntent.putExtra("size"," "+ (size+1));
                MainActivity.this.startActivity(myIntent);
            }
        });




    }

    private void prepareLessonData() {
        Lesson lesson = new Lesson("Lesson 1", "Android", "31 Nov 2016", "After completing the previous lesson, you have an app that shows an activity (a single screen) with a text field and a button. In this lesson, you’ll add some code to MainActivity that starts a new activity when the user clicks the Send button.");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 2", "Android", "1 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 3", "SQL", "3 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 4", "SQL", "5 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 5", "Web development", "7 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 6", "Android", "9 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 7", "Android", "11 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 8", "SQL", "13 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 9", "Animation", "15 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 10", "Web development", "17 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 11", "SQL", "19 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 12", "Android", "21 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 13", "SQL", "23 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 14", "Android", "25 Des 2016");
        lessonsList.add(lesson);

        lesson = new Lesson("Lesson 15", "Web development", "27 Des 2016");
        lessonsList.add(lesson);

        mAdapter.notifyDataSetChanged();
    }






}