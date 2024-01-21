package mode23.mode_abstractfactory

interface Human {

    fun getColor()

    fun talk()

    fun getSex()

}

abstract class AbstractWhiteHuman : Human {

    override fun getColor() {
        println("white human color: white")
    }

    override fun talk() {
        println("white human talk ")
    }

}

abstract class AbstractBlackHuman : Human {

    override fun getColor() {
        println("black human color: black")
    }

    override fun talk() {
        println("black human talk ")
    }

}

abstract class AbstractYellowHuman : Human {

    override fun getColor() {
        println("yellow human color: yellow")
    }

    override fun talk() {
        println("yellow human talk ")
    }

}

class FemaleYellowHuman : AbstractYellowHuman() {

    override fun getSex() {
        println("yellow sex female")
    }

}

class MaleYellowHuman : AbstractYellowHuman() {
    override fun getSex() {
        println("yellow sex male")
    }

}

class FemaleWhiteHuman : AbstractWhiteHuman() {

    override fun getSex() {
        println("white sex female")
    }

}

class MaleWhiteHuman : AbstractWhiteHuman() {
    override fun getSex() {
        println("white sex male")
    }

}

class FemaleBlackHuman : AbstractBlackHuman() {

    override fun getSex() {
        println("Black sex female")
    }

}

class MaleBlackHuman : AbstractBlackHuman() {
    override fun getSex() {
        println("Black sex male")
    }

}















