package data_structures

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StackTest {

    var stack = Stack()

    @BeforeEach
    fun setUp() {
        for (i in 0..50){
            val randomValue = (0..10000).random()
            stack.stackAdd(randomValue);
        }
    }

    @AfterEach
    fun tearDown() {
        stack.stackClear()
    }

    @Test
    fun stackAdd() {
        for (i in 0..5){
            val randomValue = (0..10000).random()
            stack.stackAdd(randomValue);
            assert(stack.stackContains(randomValue) != -1)
        }
    }

    @Test
    fun stackPop() {
        val randomValue = (0..10000).random()
        stack.stackAdd(randomValue);
        assert(stack.stackPop() == randomValue);
    }

    @Test
    fun stackRead() {
        val randomValue = (0..10000).random()
        stack.stackAdd(randomValue);
        assert(stack.stackRead() == randomValue);
    }

    @Test
    fun stackContains(){
        val randomValue = (0..10000).random()
        stack.stackAdd(randomValue);
        assert(stack.stackContains(randomValue) != -1)
    }

    @Test
    fun clearStack(){
        val currentSize = stack.stackSize()
        stack.stackClear()
        val newSize = stack.stackSize();
        assert(currentSize != newSize)
        assert(newSize == 0)
    }

    @Test
    fun stackSize(){
        val currentSize = stack.stackSize()
        val randomValue = (0..5).random()
        for (i in 1..randomValue){
            val randomValue = (0..10000).random()
            stack.stackAdd(randomValue);
        }
        val newSize = stack.stackSize()
        println(currentSize)
        println(randomValue)
        println(newSize)
        assert(newSize == currentSize + randomValue)
    }

}