package data_structures

class BinarySearchTree {

    private var root = Node(50)

    fun getRoot():Node{
        return root
    }

    fun searchValue(searchValue: Int,node:Node?): Node? {
        if (node == null){
            println("node was null")
            println(node?.getParentNode())
            return node?.getParentNode()
        }
        if (node.getValue() == searchValue){
            println("node was found")
            return node
        }
        if (searchValue < node.getValue()){
            println("node was higher")
            if (node.getLeftNode() != null){
                return searchValue(searchValue,node.getLeftNode());
            } else {
                return node
            }

        } else {
            println("node was lower")
            if (node.getRightNode() != null){
                return searchValue(searchValue,node.getRightNode());
            } else {
                return node
            }

        }
    }

    fun insertValue(insertValue: Int){
        var bestParentNode = searchValue(insertValue,getRoot())
        val newNode = Node(insertValue)
        println("no fit, adding a new node")
        if (bestParentNode?.getValue()!! > insertValue){
            bestParentNode.setLeftNode(newNode)
            newNode.setParentNode(bestParentNode)
        } else {
            bestParentNode.setRightNode(newNode)
            newNode.setParentNode(bestParentNode)
        }
        println(searchValue(insertValue,getRoot()))
    }

}