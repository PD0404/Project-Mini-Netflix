package com.personal;

public class App {

    // TODO 1: Identify the basic structure of a Java program.
    // - Every program starts from the main method.
    // - Class names should be meaningful and follow PascalCase (e.g., App, MovieService).

    public static void main( String[] args )
    {
        System.out.println( "Java Basics!" );
        
        // TODO 2: Declare and initialize identifiers using primitive data types
        // Use identifiers like movieName, releaseYear, isTrending, etc.
        String movieName = "Inception";
        int releaseYear = 2010;
        boolean isTrending = true;

        // TODO 3: Use various operators
        // Arithmetic: Calculate movie age
        int currentYear = 2025;
        int movieAge = currentYear - releaseYear;

        // Relational: Check if movie is older than 10 years
        boolean isClassic = movieAge > 10;

        // Logical: Determine if movie is trending and classic
        boolean showInBanner = isTrending && isClassic;

        // TODO 4: Print all values using System.out.println
        System.out.println("Movie Name: " + movieName);
        System.out.println("Movie Age: " + movieAge);
        System.out.println("Is Classic: " + isClassic);
        System.out.println("Show in Banner: " + showInBanner);

        // TODO 5: Try creating a new class `User` and define attributes like userId, username, isPremium
        // - Demonstrate variable declaration, assignment, and data type usage there too.
        // This introduces the concept of user-defined data types and identifiers

        // TODO 7: In `User` class, Create a constructor to initialize User data

        // TODO 8: In `User` class, Create a method to display user info

        // TODO 9: In `App` class, Create a user object and call displayInfo
    }
}
