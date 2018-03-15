package com.jflavio1.cleanarchsample.presenter.showmovies

import com.jflavio1.cleanarchsample.presenter.ShowMoviesPresenter
import com.jflavio1.cleanarchsample.view.BaseView
import com.jflavio1.domain.model.Movie

/**
 * ShowMoviesListPresenterImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class ShowMoviesListPresenterImpl : ShowMoviesPresenter<Movie> {

    override fun loadMovieList() {
    }

    override fun initView(view: BaseView) {
    }

    override fun onMoviesListLoaded(movieList: ArrayList<Movie>) {
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun showErrorMessage(message: String) {
    }

    override fun destroy() {
    }

}