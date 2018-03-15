package com.jflavio1.cleanarchsample.view

import android.content.Context
import com.jflavio1.cleanarchsample.presenter.BasePresenter

/**
 * BaseView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface BaseView<in Presenter : BasePresenter> {

    fun initPresenter(presenter: Presenter)

    fun getContext(): Context

}