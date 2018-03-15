package com.jflavio1.cleanarchsample.view

import android.content.Context

/**
 * BaseView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface BaseView {

    fun showLoader()

    fun hideLoader()

    fun showError(errorMessage: String)

    fun getContext(): Context

}