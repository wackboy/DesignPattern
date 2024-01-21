package mode23.mode_delegate

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class MyInvocationHandler(
    private val obj: Any
) : InvocationHandler {


    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any? {
        var result: Any? = null
        kotlin.runCatching {
            result = method.invoke(this.obj, *args.orEmpty())
        }
        return result
    }

}

class DynamicProxy {

    companion object {

        fun newProxyInstance(loader: ClassLoader, faces: Array<Class<*>>, h: InvocationHandler): Any {
            return Proxy.newProxyInstance(loader, faces, h)
        }
    }


}

interface IAdvice {
    fun exec()
}

class BeforeAdvice : IAdvice {
    override fun exec() {
        println("前置通知")
    }
}

fun main() {
    // 定义主题
    val subject = RealSubject()
    // 定义Handler
    val handler = MyInvocationHandler(subject)
    val proxy = DynamicProxy.newProxyInstance(
        subject::class.java.classLoader,
        subject::class.java.interfaces,
        handler
    ) as Subject
    proxy.request("sr" as Any)

}

















