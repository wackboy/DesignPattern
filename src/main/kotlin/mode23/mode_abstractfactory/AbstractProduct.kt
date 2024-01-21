package mode23.mode_abstractfactory

abstract class AbstractProductA {

    // 注意open fun 和 fun的区别
    open fun shareMethod() {}

    abstract fun doSomething()

}

abstract class AbstractProductB {

    // 注意open fun 和 fun的区别
    open fun shareMethod() {}

    abstract fun doSomething()

}

class ProductA1 : AbstractProductA() {

    override fun doSomething() {
        println("ProductA1 impl method")
    }


}

class ProductA2 : AbstractProductA() {

    override fun doSomething() {
        println("ProductA2 impl method")
    }

}

class ProductB1 : AbstractProductB() {

    override fun doSomething() {
        println("ProductB1 impl method")
    }

}

class ProductB2 : AbstractProductB() {

    override fun doSomething() {
        println("ProductB2 impl method")
    }

}





