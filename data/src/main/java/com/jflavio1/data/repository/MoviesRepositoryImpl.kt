package com.jflavio1.data.repository

import com.jflavio1.domain.model.Movie
import com.jflavio1.domain.repository.MoviesRepository
import io.reactivex.Observable
import java.lang.Thread.sleep

/**
 * MoviesRepositoryImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  15/3/17
 */
class MoviesRepositoryImpl : MoviesRepository {

    /**
     * This method should be called on a background thread and no on the UI Thread.
     */
    override fun getMovies(): Observable<List<Movie>> {
        val m1 = Movie("movie1", "spiderman", "john", "1.5 hrs", 2009)
        val m2 = Movie("movie2", "batman", "sam", "2 hrs", 2002)
        val array = arrayListOf<Movie>()
        array.add(m1)
        array.add(m2)

        // we simulate that retrieve data takes 4 seconds...
        sleep(4000)

        return Observable.just(array)
    }
}