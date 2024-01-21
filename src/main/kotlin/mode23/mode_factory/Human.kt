package mode23.mode_factory

interface Human {
    
    fun getColor()
    
    fun talk()
    
}

class BlackHuman : Human {
    override fun getColor() {
        println("black color")
    }

    override fun talk() {
        println("black says")
    }
}

class YellowHuman : Human {
    override fun getColor() {
        println("yellow color")
    }

    override fun talk() {
        println("yellow says")
    }
}

class WhiteHuman : Human {
    override fun getColor() {
        println("white color")
    }

    override fun talk() {
        println("white says")
    }

}

