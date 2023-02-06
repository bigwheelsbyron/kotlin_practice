package data_structures

class Stack{

    private val mutableList : MutableList<Any> = arrayListOf()

    fun stackAdd(value:Any){
        mutableList += value
    }

    fun stackPop():Any{
        val last = stackRead()
        mutableList.removeAt(mutableList.size-1)
        return last
    }

    fun stackRead():Any{
        return mutableList[mutableList.size-1]
    }

    fun stackContains(searchValue:Any):Int{
        var index = -1

        mutableList.forEachIndexed {ind, i ->
            if (i == searchValue){
                index = ind
            }
        }
        return index
    }

    fun stackClear(){
        mutableList.clear()
    }

    fun stackSize():Int{
        return mutableList.size
    }


}