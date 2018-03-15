package com.jflavio1.cleanarchsample.view.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.jflavio1.cleanarchsample.R
import com.jflavio1.cleanarchsample.model.MovieModel

/**
 * ShowMoviesAdapter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class ShowMoviesAdapter : RecyclerView.Adapter<ShowMoviesAdapter.MovieHolder>() {

    lateinit var movieList: ArrayList<MovieModel>

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MovieHolder {
        return MovieHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_movie, parent, false))
    }

    fun updateList(list: ArrayList<MovieModel>){
        this.movieList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MovieHolder?, position: Int) {
        holder!!.fill(movieList.get(position))
    }

    class MovieHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var nameTv: TextView = itemView!!.findViewById(R.id.movieItem_tv_title)

        fun fill(movie: MovieModel) {
            nameTv.text = movie.movieName
        }

    }

}