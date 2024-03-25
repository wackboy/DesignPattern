package mode23.mode_state


/**
 * Author: wackyboy
 * Date: 2024/3/24
 */
abstract class State {

    var context: Context? = null

    fun setContext(context: Context) {
        this.context = context
    }

    abstract fun handle1()

    abstract fun handle2()

}


class ConcreteState1 : State() {

    override fun handle1() {
        // must handle
    }

    override fun handle2() {
        // TODO("Not yet implemented")
    }

}

class ConcreteState2 : State() {

    override fun handle1() {
        // TODO("Not yet implemented")
    }

    override fun handle2() {
        // must handle
    }

}

// 环境角色
class Context {
    val STATE1 = ConcreteState1()
    val STATE2 = ConcreteState2()

    private var currentState: State? = null

    fun getCurrentState(): State? = currentState

    fun setCurrentState(currentState: State) {
        this.currentState = currentState
        this.currentState?.setContext(this)
    }

    fun handle1() {
        this.currentState?.handle1()
    }

    fun handle2() {
        this.currentState?.handle2()
    }

}

fun main() {
    val context = Context()
    context.setCurrentState(ConcreteState1())
    context.handle1()
    context.handle2()
}




