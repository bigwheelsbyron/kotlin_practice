package data_structures

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class BinarySearchTreeTest {

    var testTree = BinarySearchTree()

    @BeforeEach
    fun setUp(){
        testTree.getRoot().setValue(50)
        var leftNode = Node(25)
        testTree.getRoot().setLeftNode(leftNode)
        leftNode.setParentNode(testTree.getRoot())
        var rightNode = Node(75)
        testTree.getRoot().setRightNode(rightNode)
        rightNode.setParentNode(testTree.getRoot())
    }

    @Test
    fun searchValue() {
        var root = testTree.getRoot()
        println(root.getValue())
        var node = testTree.searchValue(searchValue = 75,root)
        assert(node?.getValue() == 75)
    }

    @Test
    fun insertValue() {
        testTree.insertValue(74)
    }




}