package com.jflavio1.cleanarchsample.view.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jflavio1.cleanarchsample.R
import com.jflavio1.cleanarchsample.model.MovieModel
import com.jflavio1.cleanarchsample.view.ShowMoviesView

/**
 * @author Jose Flavio
 */
class ShowMoviesListActivity : AppCompatActivity(), ShowMoviesView<ArrayList<MovieModel>> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_movies_list)
    }

    override fun showLoader() {
    }

    override fun hideLoader() {
    }

    override fun showError(errorMessage: String) {
    }

    override fun getContext(): Context = this

    override fun renderMovieList(moveList: ArrayList<MovieModel>) {
    }

}
