package com.driver;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
    private String password;
    private List<String> uploadedVideos;

    public User(String username, String password) {
    	// your code goes here
    }

    public String getUsername() {
    	// your code goes here
        return username;
    }

    public String getPassword() {
    	// your code goes here
        return password;
    }

    public List<String> getUploadedVideos() {
    	// your code goes here
        return uploadedVideos;
    }
}
