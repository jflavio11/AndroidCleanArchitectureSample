package com.jflavio1.cleanarchsample.presenter

/**
 * ShowMoviesPresenter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface ShowMoviesPresenter<T> : BasePresenter {

    fun loadMovieList()

    fun onMoviesListLoaded(movieList: ArrayList<T>)

    fun showErrorMessage(message: String)

}