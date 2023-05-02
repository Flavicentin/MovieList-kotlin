package br.com.fiap.movies.data

data class MovieModel (
    val name: String,
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean
    )
