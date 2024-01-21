package mode23.mode_mediator

abstract class Mediator {

    var c1: ConcreteColleague1? = null
    var c2: ConcreteColleague2? = null

    abstract fun doSomething1()

    abstract fun doSomething2()

}

abstract class Colleague(
    mediator: Mediator
) {

}

class ConcreteColleague1(
    private val mediator: Mediator
) : Colleague(mediator) {

    fun selfMethod1() {

    }

    fun depthMethod1() {
        mediator.doSomething1()
    }

}

class ConcreteColleague2(
    private val mediator: Mediator
) : Colleague(mediator) {

    fun selfMethod2() {

    }

    fun depthMethod2() {
        mediator.doSomething2()
    }

}

class ConcreteMediator : Mediator() {

    override fun doSomething1() {
        c1?.selfMethod1()
    }

    override fun doSomething2() {
        c2?.selfMethod2()
    }

}







