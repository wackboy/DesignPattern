package mode23.mode_state

/**
 * Author: wackyboy
 * Date: 2024/3/24
 */
abstract class LifeState {

    // 定义上下文
    var context: Context2? = null

    fun setContext(mContext: Context2) {
        this.context = mContext
    }

    abstract fun open()

    abstract fun close()

    abstract fun run()

    abstract fun stop()

}

class Context2 : LifeState() {

    fun getLifeState(): LifeState? {
        return null
    }

    fun setLifeState() {

    }


    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun run() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }


}

class OpenningState : LifeState() {

    override fun open() {
        println("open")
    }

    override fun close() {
        super.context?.setLifeState()
        super.context?.getLifeState()?.close()
    }

    override fun run() {
        // TODO("Not yet implemented")
    }

    override fun stop() {
        // TODO("Not yet implemented")
    }

}

