package mode23.modedelegate

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class GamePlayIH(
    private val obj: Any
) : InvocationHandler {

    val cls: Class<Any>? = null

    // 完成对于真实方法的调用
    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any {
        val result = method.invoke(this.obj, args)
        return result
    }
}

fun main() {
    val player = GamePlayer("zhangsa")
    val handler = GamePlayIH(player)
    val cl = player::class.java.classLoader
    val proxy: IGamePlayer =
        Proxy.newProxyInstance(cl, arrayOf(IGamePlayer::class.java), handler) as IGamePlayer
    proxy.upgrade()
    proxy.login("zhangsan", "23fe")
    proxy.killBoss()
}

