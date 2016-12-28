/**
 * Created by mohammed on 22/12/2016.
 */
package com.example.mohammed.lessonsmanager;

public class Lesson {



    private String title,detail, date,info;

    public Lesson() {
    }

    public Lesson(String title, String detail, String date) {
        this.title = title;
        this.detail = detail;
        this.date = date;

    }
    public Lesson(String title, String detail, String date,String info) {
        this.title = title;
        this.detail = detail;
        this.date = date;
        this.info=info;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDate() {
        return date;
    }

    public void setdate(String date) {
        this.date= date;
    }

    public String getDetail() {
        return detail;
    }

    public void setGenre(String genre) {
        this.detail = detail;
    }

    public String getinfo() {
        return info;
    }

    public void setinfo(String info) {
        this.info = info;
    }
}