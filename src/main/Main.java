/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author udayk
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Enter 'y' to create a new movie or any other key to exit: ");
            userInput = sc.next();

            if (userInput.equalsIgnoreCase("y")) {
                createMovie(sc);
            } else {
                System.out.println("Exiting program...");
            }
        } while (userInput.equalsIgnoreCase("y"));

        sc.close();
    }

    public static void createMovie(Scanner sc) {
        System.out.println("Creating a new movie...");

        // Input movie details
        System.out.print("Enter movie title: ");
        String title = sc.next();
        System.out.print("Enter movie director: ");
        String director = sc.next();
        System.out.print("Enter release year: ");
        int releaseYear = sc.nextInt();
        System.out.print("Enter genre: ");
        String genreName = sc.next();
        Genre genre = new Genre(genreName); // Assuming Genre class is already defined
        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();

        // Create the movie object
        Movie movie = new Movie(title, director, releaseYear, genre, rating);

        // Display movie details
        System.out.println("Movie created successfully!");
        movie.displayDetails();
    }
}