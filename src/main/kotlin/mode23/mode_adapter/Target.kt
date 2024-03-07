package mode23.mode_adapter

interface Target {

    fun request()

}

class ConcreteTarget : Target {

    override fun request() {
        println("call me")
    }

}

open class Adaptee {

    fun doSomething() {
        println("I'm kind of busy")
    }

}

class CustomAdapter : Adaptee(), Target {

    override fun request() {
        super.doSomething()
    }

}




