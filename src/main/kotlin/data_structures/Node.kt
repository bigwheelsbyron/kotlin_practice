package data_structures


class Node(value: Int) {

    private var value = value
    private var parentNode: Node? = null
    private var leftNode: Node? = null
    private var rightNode: Node? = null

    fun getValue(): Int {
        return value
    }

    fun setValue(value: Int){
        this.value = value
    }

    fun getParentNode():Node? {
        return parentNode
    }

    fun setParentNode(node: Node){
        parentNode = node
    }

    fun getLeftNode():Node? {
        return leftNode
    }

    fun setLeftNode(node: Node){
        leftNode = node
    }

    fun getRightNode():Node? {
        return rightNode
    }

    fun setRightNode(node: Node){
        rightNode = node
    }





}