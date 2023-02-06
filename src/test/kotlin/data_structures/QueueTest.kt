package data_structures

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class QueueTest {

    var queue = Queue()

    @BeforeEach
    fun setUp() {
        for (i in 0..50){
            val randomValue = (0..10000).random()
            queue.queueAdd(randomValue);
        }
    }

    @AfterEach
    fun tearDown() {
        queue.queueClear()
    }

    @Test
    fun queueAdd() {
        for (i in 0..5){
            val randomValue = (0..10000).random()
            queue.queueAdd(randomValue);
            assert(queue.queueContains(randomValue) != -1)
        }
    }

    @Test
    fun queuePop() {
        queue.queueClear()
        val randomValue = (0..10000).random()
        queue.queueAdd(randomValue);
        assert(queue.queuePop() == randomValue);
    }

    @Test
    fun queueRead() {
        queue.queueClear()
        var randomValue = (0..10000).random()
        queue.queueAdd(randomValue);
        assert(queue.queuePop() == randomValue);
        var newRandomValue = (0..10000).random()
        queue.queueAdd(newRandomValue);
        assert(queue.queueRead() != randomValue);
        assert(queue.queuePop() == newRandomValue);
    }

    @Test
    fun queueContains() {
        var randomValue = (0..10000).random()
        queue.queueAdd(randomValue);
        assert(queue.queueContains(randomValue) != -1)
    }

    @Test
    fun queueClear() {
        val currentSize = queue.queueSize()
        queue.queueClear()
        val newSize = queue.queueSize();
        assert(currentSize != newSize)
        assert(newSize == 0)
    }

    @Test
    fun queueSize() {
        val currentSize = queue.queueSize()
        val randomValue = (0..5).random()
        for (i in 1..randomValue){
            val randomValue = (0..10000).random()
            queue.queueAdd(randomValue);
        }
        val newSize = queue.queueSize()
        println(currentSize)
        println(randomValue)
        println(newSize)
        assert(newSize == currentSize + randomValue)
    }
}