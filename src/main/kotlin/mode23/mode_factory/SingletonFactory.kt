package mode23.mode_factory

class SingletonFactory {
    companion object {
        private var singleton: Singleton? = null
    }
    init {
        initSingleton()
    }

    private fun initSingleton() =
        if (singleton == null) {
            val clazz = Singleton::class.java
            val constructor = clazz.getDeclaredConstructor()
            // 设置无参构造是可以被访问的
            constructor.isAccessible = true
            singleton = constructor.newInstance()
            singleton!!
        } else {
            singleton!!
        }

    fun getSingleton() = singleton

}

class Singleton {
    fun doSomething() {
        SingletonFactory().getSingleton()
    }
}

fun main() {
    println(SingletonFactory().getSingleton()?.hashCode())
    println(SingletonFactory().getSingleton()?.hashCode())
    println(SingletonFactory().hashCode())
    println(SingletonFactory().hashCode())
}