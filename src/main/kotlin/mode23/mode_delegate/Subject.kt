package mode23.mode_delegate

interface Subject {

    fun request(str: Any)

}

class RealSubject : Subject {
    override fun request(str: Any) {
        println("realSubject request: $str")
    }
}

class Proxy(
    private val subject: Subject
) : Subject {

    override fun request(str: Any) {
        before()
        subject.request(str)
        after()
    }

    private fun before() {

    }

    private fun after() {

    }

}










