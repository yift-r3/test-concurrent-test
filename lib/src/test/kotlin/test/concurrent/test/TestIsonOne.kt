package test.concurrent.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Isolated
import test.concurrent.test.MyTest.testMe

@Isolated
class TestIsonOne {
    @Test
    fun one() {
        testMe()
    }
    @Test
    fun two() {
        testMe()
    }
    @Test
    fun three() {
        testMe()
    }
}