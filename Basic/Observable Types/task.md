## Observable Types

RxJava has several types of observable that can be used depending on use case needed.
1. [Observable](http://reactivex.io/RxJava/javadoc/io/reactivex/Observable.html) can represent finite or infinite streams. Flowable support back-pressure.
2. [Single](http://reactivex.io/RxJava/javadoc/io/reactivex/Single.html) are streams with a single element.
3. [Completable](http://reactivex.io/RxJava/javadoc/io/reactivex/Completable.html) represents a stream with no elements, i.e it can only complete without a value or fail.
4. [Maybe](http://reactivex.io/RxJava/javadoc/io/reactivex/Maybe.html) are streams with either 0 or one element.
5. [Flowable](http://reactivex.io/RxJava/javadoc/io/reactivex/Flowable.html)  is Observable with back-pressure support.
