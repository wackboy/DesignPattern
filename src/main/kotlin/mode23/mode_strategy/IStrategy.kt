package mode23.mode_strategy

interface IStrategy {

    fun operate()

}

class BackDoor : IStrategy {
    override fun operate() {
        println("找乔国老开后门")
    }

}

class GivenGreenLight : IStrategy {
    override fun operate() {
        println("找吴国太开绿灯")
    }

}

class BlockEnemy : IStrategy {
    override fun operate() {
        println("孙夫人断后")
    }

}

class Context(
    private val strategy: IStrategy
) {
    fun operate() {
        this.strategy.operate()
    }
}

fun main() {
    var context: Context
    context = Context(BackDoor())
    context.operate()
    context = Context(GivenGreenLight())
    context.operate()
    context = Context(BlockEnemy())
    context.operate()

}














