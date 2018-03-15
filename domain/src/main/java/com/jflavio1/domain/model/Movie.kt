package com.jflavio1.domain.model

/**
 * Movie
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class Movie() {

    lateinit var id: String
    lateinit var movieName: String
    lateinit var movieDirector: String
    lateinit var movieDuration: String
    var year: Int = 0

    constructor(id: String, movieName: String, movieDirector: String, movieDuration: String, year: Int) : this() {
        this.id = id
        this.movieName = movieName
        this.movieDirector = movieDirector
        this.movieDuration = movieDuration
        this.year = year
    }

}