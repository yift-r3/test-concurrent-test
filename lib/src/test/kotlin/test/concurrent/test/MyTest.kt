package test.concurrent.test

object MyTest {
    fun testMe() {
        val element = Thread.currentThread().stackTrace[2]
        val name = "${element.className}:${element.methodName}"
        println("Starting $name")
        Thread.sleep(10000)
        println("Done $name")
    }
}