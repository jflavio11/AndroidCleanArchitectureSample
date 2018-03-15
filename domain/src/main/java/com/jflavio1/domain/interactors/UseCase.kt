package com.jflavio1.domain.interactors

import com.jflavio1.domain.exec.PostExecutor
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


/**
 * UseCase
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
abstract class UseCase<T, Params> {

    private lateinit var disposables: CompositeDisposable
    private var executor: PostExecutor

    constructor(executor: PostExecutor) {
        this.disposables = CompositeDisposable()
        this.executor = executor
    }

    /**
     * returns an [Observable] for 'listening' its events
     */
    abstract fun buildUseCaseObservable(params: Params?): Observable<T>

    /**
     * Executes the current use case.
     *
     * @param observer will listener for the events of the [Observable] object created at [buildUseCaseObservable]
     */
    fun executeUseCase(observer: DisposableObserver<T>, params: Params?) {
        val observable = this.buildUseCaseObservable(params).subscribeOn(Schedulers.io()).observeOn(executor.getScheduler())
        addDisposableSubscriber(observable.subscribeWith(observer))
    }

    /**
     * Dispose this [disposable] object.
     */
    fun dispose() {
        if (!disposables.isDisposed) {
            disposables.dispose()
        }
    }

    /**
     * Adds a disposable to our disposable list [disposables]
     */
    private fun addDisposableSubscriber(disposable: Disposable) {
        disposables.add(disposable)
    }

}