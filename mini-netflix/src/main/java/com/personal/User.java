package com.personal;

// TODO 6: Use a class to define a structure for Netflix users
// This introduces the concept of user-defined data types and identifiers

public class User {
    int userId;
    String username;
    boolean isPremium;

    // TODO 7: Create a constructor to initialize User data
    public User(int userId, String username, boolean isPremium) {
        this.userId = userId;
        this.username = username;
        this.isPremium = isPremium;
    }

    // TODO 8: Create a method to display user info
    public void displayInfo() {
        System.out.println("User: " + username + ", Premium: " + isPremium);
    }
}
