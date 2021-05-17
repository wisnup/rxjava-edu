import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

object Operator {

    fun map(): Observable<String> {
        return Observable.just(1, 2, 3)
                .map { "${it * 2}" }
    }

    fun flatMap(): Observable<String> {
        return Observable.just(1, 2, 3)
                .flatMap {
                    Observable.just("$it", "$it", "$it")
                }
    }

    fun defer(): Observable<Int> {
        var database = 1
        val observable = Observable.defer {
            Observable.just(database) // run/evaluate after subscription
        }
        database += 1
        return observable
    }

    fun merge() {
//        val observable = Observable.merge(
//                Observable.interval(3, TimeUnit.MILLISECONDS),
//                Observable.interval(2, TimeUnit.MILLISECONDS)
//        )
//
//        return observable
    }

    fun take(): Observable<Int> {
        val observable = Observable.just(1,2,3).take(0)

        return observable
    }

    fun startWith(): Observable<Int> {
        val observable = Observable.just(1,2,3).startWith(0)

        return observable
    }

    fun ignoreElement(): Completable {
        val observable = Observable.just(1,2,3)

        return observable.ignoreElements()
    }

    fun publishSubject(): Observable<Int> {
        val publishSubject = PublishSubject.create<Int>()
        publishSubject.onNext(1)

        return publishSubject
    }

    fun behaviorSubject(): Observable<Int> {
        val behaviorSubject = BehaviorSubject.create<Int>()
        behaviorSubject.onNext(1) // view state when idle
        behaviorSubject.onNext(2) // view state when topic loaded

        return behaviorSubject
    }
}

