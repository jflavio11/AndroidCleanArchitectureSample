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
     * T could be a [HashMap] if the repository is Firebase or [ArrayList] if it is more simple (no too much data)
     */
    fun renderMovieList(movieList: ArrayList<T>)

}