package br.com.fiap.movies.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.data.MovieDataSource
import br.com.fiap.movies.databinding.MovieItemBinding
import br.com.fiap.movies.data.MovieModel

class MoviesAdapter(private val context: Context, private val movieList: MutableList<MovieModel>):
    RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtmovieTitle = binding.movieTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemList = MovieItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MovieViewHolder(itemList)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.txtmovieTitle.text = movieList[position].name
    }

}