package mode23.mode_delegate

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

interface IRentHouse {

    fun visitHouse()

    fun argueRent()

    fun signAgreement()

}

interface ICount {
    fun disCount()
}

// 房东
class HouseOwner : IRentHouse, ICount {
    override fun visitHouse() {
        println("看房")
    }

    override fun argueRent() {
        println("讨价还价")
    }

    override fun signAgreement() {
        println("签约")
    }

    override fun disCount() {
        println("打折")
    }

}

// 中介
class HouseAgent(hostOwner: IRentHouse) : IRentHouse by hostOwner {

}

class AgentHandler(
    private val target: Any
) : InvocationHandler {

    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any? {
        println("method invoke before")
        var result: Any? = null
        kotlin.runCatching {
            result = method.invoke(target, *args.orEmpty())
        }
        println("method invoke after")
        return result
    }

}

class HouseAgentSmart(houseOwner: IRentHouse) {
    var mHouseOwner: IRentHouse = houseOwner

    /**
     * ClassLoader: 被代理类的类加载器
     * Class<?>[]: 被代理的接口，要看你的被代理对象实现了多少个接口
     * InvocationHandler: 代理的具体行为，这里可以做AOP方法增强
     * return Object: 代理对象
     */
    init {
        this.mHouseOwner = Proxy.newProxyInstance(
            houseOwner.javaClass.classLoader,
            arrayOf(IRentHouse::class.java, ICount::class.java),
            AgentHandler(mHouseOwner)
        ) as IRentHouse
    }

}


// 静态代理&动态代理
fun main() {
//    val houseOwner = HouseOwner()
//    val agent = HouseAgent(houseOwner)
    val agent = HouseAgentSmart(HouseOwner()).mHouseOwner
    agent?.argueRent()
    agent?.visitHouse()
    agent?.signAgreement()
    // 动态代理多个接口的实现类
    (agent as ICount).disCount()

}



