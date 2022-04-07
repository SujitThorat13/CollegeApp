package com.example.collegeapp.ui.notice.domain.models;

import java.util.Objects;

import androidx.annotation.NonNull;

public class NoticeData {
    String title, image, date, time, key;

    public NoticeData() {

    }

    public NoticeData(String title, String time, String image, String date, String key) {

        this.title = title;
        this.time = time;
        this.image = image;
        this.date = date;
        this.key = key;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void getImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void getDate(String date) {
        this.date = date;
    }

    public String getKey() {
        return key;
    }

    public void getKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoticeData)) return false;
        NoticeData that = (NoticeData) o;
        return Objects.equals(title, that.title) && Objects.equals(image, that.image) && Objects.equals(date, that.date) && Objects.equals(time, that.time) && Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, image, date, time, key);
    }

    @NonNull
    @Override
    public String toString() {
        return "NoticeData{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
