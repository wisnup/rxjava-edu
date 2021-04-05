import org.junit.Test

class Test {

    @Test
    fun observable() {
        Types.observable()
                .doOnNext { println(it) }
                .test()
                .assertResult(1, 2, 3)
    }

    @Test
    fun single() {
        Types.single()
                .doOnSuccess { println(it) }
                .test()
                .assertResult(1)
    }

    @Test
    fun completable() {
        Types.completable()
                .test()
                .assertComplete()
    }

    @Test
    fun maybe() {
        Types.maybe()
                .doOnSuccess { println(it) }
                .test()
                .assertResult(1)
    }

    @Test
    fun flowable() {
        Types.flowable()
                .doOnNext { println(it) }
                .test()
                .assertResult(1, 2, 3)
    }
}
