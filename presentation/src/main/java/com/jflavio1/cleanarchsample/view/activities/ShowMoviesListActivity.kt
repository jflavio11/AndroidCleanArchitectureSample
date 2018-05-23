package com.jflavio1.cleanarchsample.view.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.jflavio1.cleanarchsample.R
import com.jflavio1.cleanarchsample.UIThread
import com.jflavio1.cleanarchsample.model.MovieModel
import com.jflavio1.cleanarchsample.presenter.ShowMoviesPresenter
import com.jflavio1.cleanarchsample.presenter.showmovies.ShowMoviesListPresenterImpl
import com.jflavio1.cleanarchsample.view.ShowMoviesView
import com.jflavio1.cleanarchsample.view.adapters.ShowMoviesAdapter
import com.jflavio1.data.repository.MoviesRepositoryImpl
import com.jflavio1.domain.interactors.ShowMoviesUseCaseImpl
import kotlinx.android.synthetic.main.activity_show_movies_list.*

/**
 * @author Jose Flavio
 */
class ShowMoviesListActivity : AppCompatActivity(), ShowMoviesView<MovieModel> {

    private lateinit var adapter : ShowMoviesAdapter
    private lateinit var presenter: ShowMoviesPresenter<MovieModel>
    private val TAG = "ShowMovies"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_movies_list)
        ShowMoviesListPresenterImpl(this, ShowMoviesUseCaseImpl(MoviesRepositoryImpl(), UIThread()))
        adapter = ShowMoviesAdapter()

        showMoviesActivity_rv.let {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(this@ShowMoviesListActivity)
        }

        this.presenter.loadMovieList()
    }

    override fun initPresenter(presenter: ShowMoviesPresenter<MovieModel>) {
        this.presenter = presenter
    }

    override fun showLoader() {
        showMoviesActivity_pb.visibility = View.VISIBLE
    }

    override fun hideLoader() {
        showMoviesActivity_pb.visibility = View.INVISIBLE
    }

    override fun showError(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun getContext(): Context = this

    override fun renderMovieList(movieList: ArrayList<MovieModel>) {
        adapter.updateList(movieList)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.presenter.destroy()
    }

}
