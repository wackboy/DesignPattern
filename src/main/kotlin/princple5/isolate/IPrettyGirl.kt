package princple5.isolate

// 接口过于庞大，不利于后续扩展
interface IPrettyGirl {

    fun goodLooking()

    fun niceFinger()

    fun greatTemperament()
}

interface IGoodBodyGirl {
    fun goodLooking()

    fun niceFinger()
}

interface IGreatTemperamentGirl {
    fun greatTemperament()
}


class PrettyGirl(
    private val name: String
) : IGoodBodyGirl, IGreatTemperamentGirl {

    override fun goodLooking() {
        println(name + "goodLooking")
    }

    override fun niceFinger() {
        println(name + "niceFinger")
    }

    override fun greatTemperament() {
        println(name + "greatTemperament")
    }

}
