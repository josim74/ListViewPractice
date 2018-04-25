package josim74.github.com.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Movie> movies;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        movies = Movie.getMovies();

        movieAdapter = new MovieAdapter(this, movies);
        listView.setAdapter(movieAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //click statement...
            }
        });

        // adding new item to the list...

        movieAdapter.addNewMove(new Movie(R.drawable.code, "New Name", "New Category", "Release Year"));

    }
}
