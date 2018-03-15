package com.jflavio1.cleanarchsample.view

/**
 * ShowMoviesView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface ShowMoviesView<T> : BaseView {

    /**
     * T could be a [HashMap] if the repository is Firebase or [ArrayList] if it is more simple (no too much data)
     */
    fun renderMovieList(moveList: T)

}