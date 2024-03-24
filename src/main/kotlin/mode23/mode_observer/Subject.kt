package mode23.mode_observer

import java.util.concurrent.CopyOnWriteArrayList

abstract class Subject {

    private val observer = CopyOnWriteArrayList<Observer>()

    fun addObservers(o: Observer) {
        this.observer.add(o)
    }

    fun delObserver(o: Observer) {
        this.observer.remove(o)
    }

    fun notifyObservers() {
        for (o in this.observer) {
            o.update()
        }
    }

}

interface Observer {
    fun update()
}

class ConcreteSubject : Subject() {

    fun doSomething() {
        super.notifyObservers()
    }

}

class ConcreteObserver : Observer {
    override fun update() {
        println("handle message")
    }

}

fun main() {
    val subject = ConcreteSubject()
    val obs = ConcreteObserver()
    subject.addObservers(obs)
    subject.doSomething()
}




