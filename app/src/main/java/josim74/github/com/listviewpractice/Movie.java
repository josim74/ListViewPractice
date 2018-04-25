package josim74.github.com.listviewpractice;

import android.test.MoreAsserts;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by JosimUddin on 25/04/2018.
 */

public class Movie {
    private int movieImage;
    private String movieName;
    private String movieCategory;
    private String releaseYear;

    public Movie(int movieImage, String movieName, String movieCategory, String releaseYear) {
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
        this.releaseYear = releaseYear;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public static ArrayList<Movie> getMovies(){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));
        movies.add(new Movie(R.drawable.movie, "Avengers Infinity ware", "Scince Fiction", "2018"));

        return movies;
    }
}
