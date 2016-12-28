package com.example.mohammed.lessonsmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class info_activity extends AppCompatActivity {
    private Button button;
    private EditText textinfo;
    private EditText subTitle;
    private EditText lessonDate;
    private TextView infoTitle;
    private TextView save;
    private TextView edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_activity);
        button = (Button) findViewById(R.id.back);
        textinfo=(EditText) findViewById(R.id.infodetails);
        infoTitle=(TextView) findViewById(R.id.infoTitle);
        subTitle=(EditText) findViewById(R.id.subtitle);
        save=(TextView) findViewById(R.id.save);
        edit=(TextView) findViewById(R.id.edit);
        lessonDate=(EditText) findViewById(R.id.date);

        Intent intent = getIntent();
        String whereAreYouComeFrom = intent.getStringExtra("where");
        String listSize = intent.getStringExtra("size");
        if((whereAreYouComeFrom!=null) && whereAreYouComeFrom.contentEquals("0"))
        {
            whereAreYouComeFrom="";
            infoTitle.setText("Lesson "+listSize);

           // textinfo.setText("textinfo");
            textinfo.setEnabled(true);


            subTitle.setEnabled(true);
          //  subTitle.setText("subTitle");

            lessonDate.setEnabled(true);
          //  lessonDate.setText("lessonDate");


        }else {


            String info = intent.getStringExtra("info");
            String title = intent.getStringExtra("title");
            String subtitle = intent.getStringExtra("subtitle");
            String datestr = intent.getStringExtra("date");


            //   String list2string = intent.getStringExtra("list");


            infoTitle.setText(title);
            subTitle.setText(subtitle);
            textinfo.setText(info);
            lessonDate.setText(datestr);
        }
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textinfo.setEnabled(false);
                 Intent myIntent = new Intent(info_activity.this,MainActivity.class);
                 info_activity.this.startActivity(myIntent);

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textinfo.setEnabled(false);


            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textinfo.setEnabled(true);

            }

        });













    }
    private void prepareLessonData(String list2string ) {
        String str="Lesson";
        while(!list2string.isEmpty()){
            for(int i=0;i<list2string.length();i++)
            {

            }





        }



    }
}
