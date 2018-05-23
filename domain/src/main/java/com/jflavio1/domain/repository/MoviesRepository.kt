package com.jflavio1.domain.repository

import com.jflavio1.domain.model.Movie
import io.reactivex.Observable

/**
 * MoviesRepository
 *
 * This interface must be implemented on the Data layer an is defined here (in the Domain layer) for use it as a link between layers.
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface MoviesRepository {

    fun getMovies(): Observable<List<Movie>>

}