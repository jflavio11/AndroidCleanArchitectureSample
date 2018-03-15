package com.jflavio1.cleanarchsample

import com.jflavio1.domain.exec.PostExecutor
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * UIThread
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
class UIThread : PostExecutor {
    override fun getScheduler(): Scheduler = AndroidSchedulers.mainThread()
}