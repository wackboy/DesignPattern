package mode23.mode_facade

class ClassA {

    fun doSomethingA() {

    }

}

class ClassB {

    fun doSomethingB() {

    }

}

class ClassC {

    fun doSomethingC() {

    }

}

class Facade {
    private val a = ClassA()
    private val b = ClassB()
    private val c = ClassC()

    fun methodA() {
        this.a.doSomethingA()
    }

    fun methodB() {
        this.b.doSomethingB()
    }

    fun methodC() {
        this.c.doSomethingC()
    }

}


