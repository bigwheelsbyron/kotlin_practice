package data_structures

class Queue {

    private val mutableList : MutableList<Any> = arrayListOf()

    fun queueAdd(value:Any){
        mutableList += value
    }

    fun queuePop():Any{
        val last = queueRead()
        mutableList.removeAt(0)
        return last
    }

    fun queueRead():Any{
        return mutableList[0]
    }

    fun queueContains(searchValue:Any):Int{
        var index = -1

        mutableList.forEachIndexed {ind, i ->
            if (i == searchValue){
                index = ind
            }
        }
        return index
    }

    fun queueClear(){
        mutableList.clear()
    }

    fun queueSize():Int{
        return mutableList.size
    }
}