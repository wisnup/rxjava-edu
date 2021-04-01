import org.junit.Test

class Test {

    @Test
    fun createObservable() {
        Introduction.createObservable()
                .doOnNext { println(it) } // print here because the created observable doesn't do anything except streams
                .test() // always check the doc what an operator do. This one is used for testing, utilizing the TestObserver.
                .assertResult(1, 2, 3)
    }
}
