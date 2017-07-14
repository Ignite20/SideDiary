package com.scorched.ember.sidediary.models;

/**
 * Created by Ember on 14/07/2017.
 */

public class Diary {
    private String title;
    private String description;
    private String videoPath;
    private String videoLength;

    public Diary(String title, String description, String videoPath, String videoLength) {
        this.title = title;
        this.description = description;
        this.videoPath = videoPath;
        this.videoLength = videoLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getVideoLengh() {
        return videoLength;
    }

    public void setVideoLengh(String videoLengh) {
        this.videoLength = videoLengh;
    }
}
