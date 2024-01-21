package mode23.mode_modelmethod

/**
 * 模版方法模式：就是在抽象类中定义一系列方法的执行顺序，且一般不被修该即fun
 */
abstract class AbstractCaseClass {

    abstract fun doSomething()

    abstract fun doAnything()

    // 不一定需要被重写的方法，提供默认的实现
    open fun controlSomething() {

    }

    // 不能被外部操作的方法，认为是模版方法，外部只能调用
    fun run() {
        doSomething()
        doAnything()
        controlSomething()
    }

}