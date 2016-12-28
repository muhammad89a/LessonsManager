/**
 * Created by mohammed on 25/12/2016.
 */

package com.example.mohammed.lessonsmanager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.MyViewHolder> {

    private List<Lesson> lessonsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public LessonAdapter(List<Lesson> lessonsList) {
        this.lessonsList = lessonsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lesson lesson = lessonsList.get(position);
        holder.title.setText(lesson.getTitle());
        holder.genre.setText(lesson.getDetail());
        holder.year.setText(lesson.getDate());
    }
    @Override
    public int getItemViewType(int position) {
        return (position == lessonsList.size()) ? R.id.additem : R.id.recycler_view;
    }

    @Override
    public int getItemCount() {
        return lessonsList.size();
    }
}