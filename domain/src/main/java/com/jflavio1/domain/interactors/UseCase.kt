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
 * Defines the model for a Use Case. The call to the Repository (using the interface) must be on [buildUseCaseObservable].
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  14/3/17
 */
abstract class UseCase<T, Params> {

    private var disposables: CompositeDisposable = CompositeDisposable()
    private var executor: PostExecutor

    constructor(executor: PostExecutor) {
        this.executor = executor
    }

    /**
     * Returns an [Observable] for 'listening' its events. Should call the repository to execute this use case.
     */
    abstract fun buildUseCaseObservable(params: Params?): Observable<T>

    /**
     * Executes the current use case.
     *
     * Want to know more about Schedulers and rxJava/rxKotlin? Visit <a href="https://code.tutsplus
     * .com/es/tutorials/concurrency-in-rxjava-2--cms-29288">Concurrency in rxJava 2</a>
     *
     * Here we call [PostExecutor.getScheduler] that is implemented on the Android side (the presentation layer) and returns
     * the main thread of the application as a Scheduler (AndroidSchedulers.mainThread()).
     *
     * @param observer will listener for the events of the [Observable] object created at [buildUseCaseObservable]
     */
    fun executeUseCase(observer: DisposableObserver<T>, params: Params?) {
        val observable = this.buildUseCaseObservable(params).subscribeOn(Schedulers.io()).observeOn(executor.getScheduler())
        addDisposableSubscriber(observable.subscribeWith(observer))
    }

    /**
     * Dispose this [disposable] object if it has not been disposed yet.
     */
    fun dispose() {
        if (!disposables.isDisposed) {
            disposables.dispose()
        }
    }

    /**
     * Adds a disposable (Observer) to our disposable list [disposables]. Observer should be 'stopped' for stop
     * listening events of an Observable!
     */
    private fun addDisposableSubscriber(disposable: Disposable) {
        disposables.add(disposable)
    }

}