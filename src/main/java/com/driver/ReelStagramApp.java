package com.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReelStagramApp {
	 public static Map<String, User> users = new HashMap<>();
	    public static User currentUser = null;
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            displayMenu();
	            int choice = getUserChoice();
	            processChoice(choice);
	        }
	    }

	    private static void displayMenu() {
	    	// your code goes here
	    }

	    private static int getUserChoice() {
	    	// your code goes here
	        return scanner.nextInt();
	    }

	    private static void processChoice(int choice) {
	    	// your code goes here
	    }

	    public static void registerUser() {
	    	// your code goes here
	    }

	    public static void loginUser() {
	    	// your code goes here
	    }

	    private static void uploadVideo() {
	    	// your code goes here
	    }

	    private static void viewVideos() {
	    	// your code goes here
	    }

	    private static void deleteVideo() {
	    	// your code goes here
	    }

	    public static void logoutUser() {
	    	// your code goes here
	    }

	    private static void exit() {
	    	// your code goes here
	    }
	    
	    public static void registerUser(String username, String password) {
	    	// your code goes here
	    }

	    public static void loginUser(String username, String password) {
	    	// your code goes here
	    }

	    public static void uploadVideo(String videoFilename) {
	    	// your code goes here
	    }
}
