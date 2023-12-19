package test.concurrent.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import test.concurrent.test.MyTest.testMe

@Execution(ExecutionMode.SAME_THREAD)
class TestSameTwo {
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