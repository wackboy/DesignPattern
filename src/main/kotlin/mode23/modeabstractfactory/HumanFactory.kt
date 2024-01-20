package mode23.modeabstractfactory

interface HumanFactory {

    fun createYellowHuman(): Human

    fun createWhiteHuman(): Human

    fun createBlackHuman(): Human

}

class FemaleFactory : HumanFactory {
    override fun createYellowHuman(): Human {
        return FemaleYellowHuman()
    }

    override fun createWhiteHuman(): Human {
        return FemaleWhiteHuman()
    }

    override fun createBlackHuman(): Human {
        return FemaleBlackHuman()
    }

}

fun main() {
    val factory = FemaleFactory()
    val yellowHuman = factory.createYellowHuman()
    yellowHuman.talk()
}














