package com.jflavio1.cleanarchsample.view

import com.jflavio1.cleanarchsample.presenter.ShowMoviesPresenter

/**
 * ShowMoviesView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface ShowMoviesView<T> : BaseLoadDataView<ShowMoviesPresenter<T>> {

    /**
     * T is the movie object class type.
     */
    fun renderMovieList(movieList: ArrayList<T>)

}
