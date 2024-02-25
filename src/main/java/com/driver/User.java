package com.driver;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> uploadedVideos;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.uploadedVideos = new ArrayList<String>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getUploadedVideos() {
        return uploadedVideos;
    }
}