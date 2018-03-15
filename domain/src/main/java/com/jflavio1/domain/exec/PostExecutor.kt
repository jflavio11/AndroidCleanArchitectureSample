package com.jflavio1.domain.exec

import io.reactivex.Scheduler

/**
 * PostExecutor
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
interface PostExecutor {
    fun getScheduler(): Scheduler
}