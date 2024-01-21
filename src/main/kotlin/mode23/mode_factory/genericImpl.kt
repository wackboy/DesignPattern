package mode23.mode_factory

abstract class Product {

    fun method1() {}

    abstract fun method2()

}

class ConcreteProduct1 : Product() {
    override fun method2() {
        println("this is ConcreteProduct1")
    }

}

class ConcreteProduct2 : Product() {
    override fun method2() {
        println("this is ConcreteProduct2")
    }

}

// 抽象工厂类负责定义产品对象的产生
abstract class Creator {
    abstract fun<T: Product> createProduct(clazz: Class<T>): T
}

class ConcreteCreator : Creator() {
    override fun <T : Product> createProduct(clazz: Class<T>): T {
        val product: Product
        product = clazz.getDeclaredConstructor().newInstance()
        return product
    }
}

fun main() {
    val creator = ConcreteCreator()
    creator.createProduct(ConcreteProduct1::class.java).method2()
}


