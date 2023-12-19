package test.concurrent.test

import org.junit.jupiter.api.Test
import test.concurrent.test.MyTest.testMe

class TestOne {
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
    @Test
    fun four() {
        testMe()
    }
    @Test
    fun five() {
        testMe()
    }
    @Test
    fun six() {
        testMe()
    }
}