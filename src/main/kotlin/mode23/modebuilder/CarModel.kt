package mode23.modebuilder

abstract class CarModel {

    private var sequence = ArrayList<String>()

    abstract fun start()

    abstract fun stop()

    abstract fun alarm()

    abstract fun engineBoom()

    fun run() {
        for (i in 0 until sequence.size) {
            val actionName = sequence[i]
            if (actionName == "start") {
                start()
            } else if (actionName == "stop") {
                stop()
            } else if (actionName == "alarm") {
                alarm()
            } else {
                engineBoom()
            }
        }
    }

    fun setSequence(sequence: ArrayList<String>) {
        this.sequence = sequence
    }

}









