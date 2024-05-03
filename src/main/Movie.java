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
import java.util.ArrayList;

public class Movie implements Displayable {
    private String title;
    private String director;
    private int releaseYear;
    private Genre genre;
    private double rating;
    private ArrayList<Actor> actors;

    public Movie(String title, String director, int releaseYear, Genre genre, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
        actors = new ArrayList<>();
    }

    public Movie(String title, String director, int releaseYear, Genre genre) {
        this(title, director, releaseYear, genre, 0.0);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void removeActor(Actor actor) {
        actors.remove(actor);
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        genre.displayDetails();
        System.out.println("Rating: " + rating);
        System.out.println("Actors:");
        for (Actor actor : actors) {
            actor.displayDetails();
        }
    }
}