package com.jflavio1.cleanarchsample.view

/**
 * BaseLoadDataView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface BaseLoadDataView : BaseView {

    fun showLoader()

    fun hideLoader()

    fun showError(errorMessage: String)

}