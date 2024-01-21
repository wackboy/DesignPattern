package mode23.mode_responsechain

import java.util.Random

abstract class HandlerChain(
    private val level: Int
) {

    companion object {
        const val FATHER_LEVEL_REQUEST = 1
        const val HUSBAND_LEVEL_REQUEST = 2
        const val SON_LEVEL_REQUEST = 3
    }

    private var nextHandler: HandlerChain? = null

    fun handleMessage(women: IWomen) {
        if (women.getType() == this.level) {
            response(women)
        } else {
            if (this.nextHandler != null) {
                this.nextHandler!!.handleMessage(women)
            } else {
                println("没有能处理的方法，责任链结束～")
            }
        }
    }

    fun setNext(handlerChain: HandlerChain) {
        this.nextHandler = handlerChain
    }

    abstract fun response(women: IWomen)

}

class Father : HandlerChain(FATHER_LEVEL_REQUEST) {
    override fun response(women: IWomen) {
        println("father request")
        println(women.getRequest())
        println("father agree")
    }
}

class Husband : HandlerChain(HUSBAND_LEVEL_REQUEST) {
    override fun response(women: IWomen) {
        println("Husband request")
        println(women.getRequest())
        println("Husband agree")
    }
}

class Son : HandlerChain(SON_LEVEL_REQUEST) {
    override fun response(women: IWomen) {
        println("Son request")
        println(women.getRequest())
        println("Son agree")
    }
}

fun main() {
    val arr = ArrayList<IWomen>()
    repeat(5) {
        arr.add(Women(Random().nextInt(5), "我要去逛街"))
    }
    val father = Father()
    val husband = Husband()
    val son = Son()
    father.setNext(husband)
    husband.setNext(son)
    arr.forEach {
        father.handleMessage(it)
    }

}















