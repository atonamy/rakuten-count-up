package rakuten.test.technical.countup

class Counter {

    companion object {
        init {
            System.loadLibrary("countup")
        }
    }

    external fun countup(): Long
}