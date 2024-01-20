package mode23.modedelegate

interface Subject {

    fun request()

}

class RealSubject : Subject {
    override fun request() {

    }
}

class Proxy(
    private val subject: Subject
) : Subject {

    override fun request() {
        before()
        subject.request()
        after()
    }

    private fun before() {

    }

    private fun after() {

    }

}










