package com.jflavio1.domain.repository

import com.jflavio1.domain.model.Movie
import io.reactivex.Observable

/**
 * MoviesRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
open interface MoviesRepository {

    fun getMovies(): Observable<List<Movie>>

}