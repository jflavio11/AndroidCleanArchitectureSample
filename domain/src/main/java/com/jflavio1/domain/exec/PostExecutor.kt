package com.jflavio1.domain.exec

import io.reactivex.Scheduler

/**
 * PostExecutor
 *
 * The domain layer <strong>must not know about the presentation layer</strong>, because of this, this interface is implemented on the
 * presentation layer to return the application main thread and listen for [DefaultObserver] methods.
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface PostExecutor {
    fun getScheduler(): Scheduler
}