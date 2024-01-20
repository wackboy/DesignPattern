package mode23.modebuilder

import princple5.dip.BMW

class Director {

    private val sequence = ArrayList<String>()
    private val benzBuilder = BenzBuilder()
    private val bmwBuilder = BMWBuilder()

    fun getABenzModel(): BenzModel {
        this.sequence.clear()
        this.sequence.add("start")
        this.sequence.add("stop")
        this.benzBuilder.setSequence(this.sequence)
        return this.benzBuilder.getCarModel() as BenzModel
    }

    fun getABMWModel(): BMWModel {
        this.sequence.clear()
        this.sequence.add("alarm")
        this.sequence.add("stop")
        this.bmwBuilder.setSequence(this.sequence)
        return this.bmwBuilder.getCarModel() as BMWModel
    }


}