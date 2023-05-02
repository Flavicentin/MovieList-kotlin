package br.com.fiap.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.adapter.MoviesAdapter
import br.com.fiap.movies.data.MovieDataSource
import br.com.fiap.movies.databinding.ActivityMainBinding
import br.com.fiap.movies.data.MovieModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterMovies: MoviesAdapter
    private val movieList: MutableList<MovieModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewMovies = binding.RecyclerView
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.setHasFixedSize(true)

        adapterMovies = MoviesAdapter(this, movieList)
        recyclerViewMovies.adapter = adapterMovies

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        movieList.addAll(MovieDataSource.movieList)
        adapterMovies.notifyDataSetChanged()
    }
}
