package com.jflavio1.cleanarchsample.view.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.jflavio1.cleanarchsample.R
import com.jflavio1.cleanarchsample.UIThread
import com.jflavio1.cleanarchsample.model.MovieModel
import com.jflavio1.cleanarchsample.presenter.ShowMoviesPresenter
import com.jflavio1.cleanarchsample.presenter.showmovies.ShowMoviesListPresenterImpl
import com.jflavio1.cleanarchsample.view.ShowMoviesView
import com.jflavio1.data.repository.MoviesRepositoryImpl
import com.jflavio1.domain.interactors.ShowMoviesUseCaseImpl

/**
 * @author Jose Flavio
 */
class ShowMoviesListActivity : AppCompatActivity(), ShowMoviesView<MovieModel> {

    private lateinit var presenter: ShowMoviesPresenter<MovieModel>
    private val TAG = "ShowMovies"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_movies_list)
        ShowMoviesListPresenterImpl(this, ShowMoviesUseCaseImpl(MoviesRepositoryImpl(), UIThread()))
        this.presenter.loadMovieList()
    }

    override fun initPresenter(presenter: ShowMoviesPresenter<MovieModel>) {
        this.presenter = presenter
    }

    override fun showLoader() {
    }

    override fun hideLoader() {
    }

    override fun showError(errorMessage: String) {
    }

    override fun getContext(): Context = this

    // todo, use adapter and recycler view
    override fun renderMovieList(movieList: ArrayList<MovieModel>) {
        for (movie: MovieModel in movieList) {
            Log.d(TAG, "Movie loaded: ${movie.movieName}")
            //Toast.makeText(this, "Movie loaded: ${movie.movieName}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        this.presenter.destroy()
    }

}
