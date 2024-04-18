package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.example.Movies;

public class Main {
    public static void main(String[] args) {
        Movies movies = new Movies();
        List<Movie> movieList = movies.getMovies();
        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            System.out.println((i + 1) + ". " + movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}
