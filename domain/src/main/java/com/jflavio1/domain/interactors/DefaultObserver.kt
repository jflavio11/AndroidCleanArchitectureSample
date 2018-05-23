package com.jflavio1.domain.interactors

import io.reactivex.observers.DisposableObserver

/**
 * DefaultObserver
 *
 * Should be implemented by any object that want to observes the results of [UseCase.executeUseCase].
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
open class DefaultObserver<T> : DisposableObserver<T>() {
    override fun onComplete() {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
    }
}