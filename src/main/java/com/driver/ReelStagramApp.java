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
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Upload Video");
		System.out.println("4. View Videos");
		System.out.println("5. Delete Video");
		System.out.println("6. Logout");
		System.out.println("7. Exit");
	}

	private static int getUserChoice() {
		System.out.print("Enter your choice: ");
		return scanner.nextInt();
	}

	private static void processChoice(int choice) {
		switch (choice) {
			case 1:
				registerUser();
				break;
			case 2:
				loginUser();
				break;
			case 3:
				uploadVideo();
				break;
			case 4:
				viewVideos();
				break;
			case 5:
				deleteVideo();
				break;
			case 6:
				logoutUser();
				break;
			case 7:
				exit();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
		}
	}

	public static void registerUser() {
		System.out.print("Enter a username: ");
		String username = scanner.next();
		System.out.print("Enter a password: ");
		String password = scanner.next();

		if (!users.containsKey(username)) {
			users.put(username, new User(username, password));
			System.out.println("Registered successfully!");
		} else {
			System.out.println("Username already exists. Please choose a different one.");
		}
	}

	public static void loginUser() {
		System.out.print("Enter your username: ");
		String username = scanner.next();
		System.out.print("Enter your password: ");
		String password = scanner.next();

		if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
			currentUser = users.get(username);
			System.out.println("Login successful!");
		} else {
			System.out.println("Invalid username or password. Please try again.");
		}
	}

	private static void uploadVideo() {
		if (currentUser == null) {
			System.out.println("Please login first.");
			return;
		}

		System.out.print("Enter the video filename: ");
		String videoFilename = scanner.next();
		currentUser.getUploadedVideos().add(videoFilename);
		System.out.println("Video uploaded successfully!");
	}

	private static void viewVideos() {
		if (currentUser == null) {
			System.out.println("Please login first.");
			return;
		}

		System.out.println("Videos:");
		for (String video : currentUser.getUploadedVideos()) {
			System.out.println(video + " by " + currentUser.getUsername());
		}
	}

	private static void deleteVideo() {
		if (currentUser == null) {
			System.out.println("Please login first.");
			return;
		}

		System.out.print("Enter the video filename to delete: ");
		String videoFilename = scanner.next();

		if (currentUser.getUploadedVideos().contains(videoFilename)) {
			currentUser.getUploadedVideos().remove(videoFilename);
			System.out.println("Video deleted successfully!");
		} else {
			System.out.println("Video not found.");
		}
	}

	public static void logoutUser() {
		currentUser = null;
		System.out.println("Logged out successfully!");
	}

	private static void exit() {
		System.out.println("Exiting ReelStagram. Goodbye!");
		System.exit(0);
	}

	public static void registerUser(String username, String password) {
		users.put(username, new User(username, password));
	}

	public static void loginUser(String username, String password) {
		currentUser = users.get(username);
	}

	public static void uploadVideo(String videoFilename) {
		currentUser.getUploadedVideos().add(videoFilename);
	}
}