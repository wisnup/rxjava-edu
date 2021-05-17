import org.junit.Test

class Test {
    @Test
    fun testSolution() {
        Operator.flatMap()
                .doOnNext { println(it) }
                .test()
    }
    @Test
    fun testDefer() {
        Operator.defer()
                .doOnNext { println(it) }
                .test()
    }

    @Test
    fun testTake() {
        Operator.take()
                .doOnNext { println("$it") }
                .test()
    }

    @Test
    fun testStartWith() {
        Operator.startWith()
                .doOnNext { println("$it") }
                .test()
    }

    @Test
    fun testPublishSubject() {
        Operator.publishSubject()
                .doOnNext { println("$it") }
                .test()
    }

    @Test
    fun testBehaviorSubject() {
        Operator.behaviorSubject()
                .doOnNext { println("$it") }
                .test()
    }
}
