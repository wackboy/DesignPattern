package mode23.modebuilder

class Product {
    private var sequence: String = ""

    fun doSomething() {
        println(this.sequence)
    }

    fun setSequence(str: String) {
        this.sequence = str
    }

}

abstract class Builder {

    abstract fun setPart1(): Builder

    abstract fun setPart2(): Builder

    abstract fun setPart3(): Builder

    abstract fun buildProduct(): Product

}

class ConcreteProduct : Builder() {

    private val product = Product()

    private var some1 = ""
    private var some2 = ""
    private var some3 = ""

    override fun setPart1(): ConcreteProduct {
        some1 = "hello "
        return this
    }

    override fun setPart2(): ConcreteProduct {
        some2 = "world "
        return this
    }

    override fun setPart3(): ConcreteProduct {
        some3 = "!"
        return this
    }


    override fun buildProduct(): Product {
        product.setSequence(some1 + some2 + some3)
        return product
    }
}

class Director2 {

    private val builder = ConcreteProduct()

    fun getProduct(): Product {
        return builder.setPart1()
            .setPart2()
            .setPart3()
            .buildProduct()
    }

}

fun main() {
    val product = Director2().getProduct()
    product.doSomething()
}











