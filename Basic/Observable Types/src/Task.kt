import io.reactivex.*

object Types {

    fun observable(): Observable<Int> {
        return Observable.just(1, 2, 3)
    }

    fun single(): Single<Int> {
        return Single.just(1)
    }

    fun completable(): Completable {
        return Completable.complete()
    }

    fun maybe(): Maybe<Int> {
        return Maybe.just(1)
    }

    fun flowable(): Flowable<Int> {
        return observable().toFlowable(
                BackpressureStrategy.BUFFER
        )
    }
}
