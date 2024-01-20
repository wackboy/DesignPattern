package mode23.modeabstractfactory

abstract class AbstractCreator {

    abstract fun createProductA(): AbstractProductA

    abstract fun createProductB(): AbstractProductB

}

class Creator1 : AbstractCreator() {

    override fun createProductA(): AbstractProductA {
        return ProductA1()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB1()
    }

}

class Creator2 : AbstractCreator() {

    override fun createProductA(): AbstractProductA {
        return ProductA2()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB2()
    }

}


