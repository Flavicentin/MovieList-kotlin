package br.com.fiap.movies.adapter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.R
import br.com.fiap.movies.data.MovieDataSource
import br.com.fiap.movies.data.MovieModel

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_details)
    }
}
