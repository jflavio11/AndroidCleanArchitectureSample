package com.jflavio1.domain.interactors

import com.jflavio1.domain.exec.PostExecutor
import com.jflavio1.domain.model.Movie
import com.jflavio1.domain.repository.MoviesRepository
import io.reactivex.Observable

/**
 * ShowMoviesUseCaseImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class ShowMoviesUseCaseImpl(private val moviesRepo: MoviesRepository, executor: PostExecutor) : UseCase<List<Movie>, Void>(executor) {
    override fun buildUseCaseObservable(params: Void?): Observable<List<Movie>> = this.moviesRepo.getMovies()
}