package com.jflavio1.cleanarchsample.view

import com.jflavio1.cleanarchsample.presenter.BasePresenter

/**
 * BaseLoadDataView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface BaseLoadDataView<in Presenter : BasePresenter> : BaseView<Presenter> {

    fun showLoader()

    fun hideLoader()

    fun showError(errorMessage: String)

}