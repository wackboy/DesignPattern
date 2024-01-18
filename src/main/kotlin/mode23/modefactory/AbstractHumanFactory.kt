package mode23.modefactory

abstract class AbstractHumanFactory {

    abstract fun<T: Human> createHuman(clazz: Class<T>): T

}

class HumanFactory : AbstractHumanFactory() {

    override fun <T : Human> createHuman(clazz: Class<T>): T {
        val human: Human
        human = clazz.getDeclaredConstructor().newInstance()
        return human
    }
}

// 是工厂模式的弱化，称为简单工厂模式
class HumanFactory2 {
    companion object {
        fun<T: Human> createHuman(clazz: Class<T>): T {
            val human: Human
            human = clazz.getDeclaredConstructor().newInstance()
            return human
        }
    }
}

// 多工厂模式的抽象工厂类
abstract class MultipleAbstractFactory {
    abstract fun createHuman(): Human
}

// todo 复杂的多工厂模式下会提供一个协调类，避免调用者与子工厂的直接交流，how？
class WhiteHumanFactory : MultipleAbstractFactory() {
    override fun createHuman(): Human {
        return WhiteHuman()
    }
}

class YellowHumanFactory : MultipleAbstractFactory() {
    override fun createHuman(): Human {
        return YellowHuman()
    }

}


fun main() {
    val yinYangLu = HumanFactory()
    val whiteHuman = yinYangLu.createHuman(WhiteHuman::class.java)
    whiteHuman.talk()
    whiteHuman.getColor()
    val yellowHuman = yinYangLu.createHuman(YellowHuman::class.java)
    yellowHuman.talk()
    yellowHuman.getColor()
    val blackHuman = HumanFactory2.createHuman(BlackHuman::class.java)
    blackHuman.talk()
    blackHuman.getColor()

    val whiteHuman2 = WhiteHumanFactory().createHuman()
    whiteHuman2.talk()

}