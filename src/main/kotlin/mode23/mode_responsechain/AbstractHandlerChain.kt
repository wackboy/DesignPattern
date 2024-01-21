package mode23.mode_responsechain

abstract class AbstractHandlerChain {

    private var nextHandler: AbstractHandlerChain? = null

    fun handleMessage(request: Request): Response? {
        var response: Response? = null
        if (this.getHandlerLevel() == request.getRequestLevel()) {
            response = this.echo(request)
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler!!.handleMessage(request)
            } else {
                println("没有对应的处理器")
            }
        }
        return response
    }

    // 设置下一个处理者
    fun setNext(handler: AbstractHandlerChain) {
        this.nextHandler = handler
    }

    // 设置当前处理器的级别
    abstract fun getHandlerLevel(): Level?

    // 实现处理的任务
    abstract fun echo(request: Request): Response?

}

class Level {
    // 定义一个请求的处理等级
}

class Request {
    fun getRequestLevel(): Level? {
        return null
    }
}

class Response {
    // 处理返回的数据
}

class ConcreteHandler1 : AbstractHandlerChain() {
    override fun getHandlerLevel(): Level? {
        return null
    }

    override fun echo(request: Request): Response? {
        return null
    }

}

class ConcreteHandler2 : AbstractHandlerChain() {
    override fun getHandlerLevel(): Level? {
        return null
    }

    override fun echo(request: Request): Response? {
        return null
    }

}

class ConcreteHandler3 : AbstractHandlerChain() {
    override fun getHandlerLevel(): Level? {
        return null
    }

    override fun echo(request: Request): Response? {
        return null
    }

}

fun main() {
    val handler1 = ConcreteHandler1()
    val handler2 = ConcreteHandler2()
    val handler3 = ConcreteHandler3()
    handler1.setNext(handler2)
    handler2.setNext(handler3)
    val response = handler1.handleMessage(Request())
}













