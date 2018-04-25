package josim74.github.com.listviewpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JosimUddin on 25/04/2018.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context context;
    private ArrayList<Movie> movies;

    public MovieAdapter(@NonNull Context context, ArrayList<Movie> movies) {
        super(context, R.layout.movie_single_row ,movies);
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.movie_single_row, parent, false);

        ImageView movieImage = convertView.findViewById(R.id.movieImage);
        TextView movieName = convertView.findViewById(R.id.tvMovieName);
        TextView movieCategory = convertView.findViewById(R.id.tvMovieCategory);
        TextView releaseYear = convertView.findViewById(R.id.tvReleaseYear);

        movieImage.setImageResource(movies.get(position).getMovieImage());
        movieName.setText(movies.get(position).getMovieName());
        movieCategory.setText(movies.get(position).getMovieName());
        releaseYear.setText(movies.get(position).getReleaseYear());

        return convertView;
    }

// add new movie... to the list....
    public void addNewMove(Movie movie) {
        movies.add(movie);
        notifyDataSetChanged();
    }
}
