import io.reactivex.Observable

object Introduction {

    @JvmStatic
    fun main(args: Array<String>) {
        createAndSubscribeObservable()
    }

    private fun createAndSubscribeObservable() {
        Observable.just(1, 2, 3) // create an observable
                .subscribe { // subscribe; observable won't do anything if no one subscribed to it
                    println("$it") // observable is just a stream of data, it doesn't do anything unless you do something with the emitted data.
                }
        // okay, operator is optional but where's the scheduler tho?
    }

    fun createObservable(): Observable<Int> {
        return Observable.just(1, 2, 3)
    }
}
