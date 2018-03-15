package com.jflavio1.cleanarchsample.model.mapper

import com.jflavio1.cleanarchsample.model.MovieModel
import com.jflavio1.domain.model.Movie

/**
 * MovieModelMapper
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class MovieModelMapper {

    fun transformMovie(movie: Movie): MovieModel = MovieModel(movie.id, movie.movieName, movie.movieDirector, movie.movieDuration, movie.year)

}