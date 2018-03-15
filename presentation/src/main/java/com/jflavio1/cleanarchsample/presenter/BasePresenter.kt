package com.jflavio1.cleanarchsample.presenter

import com.jflavio1.cleanarchsample.view.BaseView

/**
 * BasePresenter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface BasePresenter {

    fun resume()

    fun pause()

    fun destroy()

}