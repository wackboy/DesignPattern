package mode23.modebuilder

import princple5.dip.Benz

abstract class CarBuilder {

    // 建造一个模型，外部设定组装顺序
    abstract fun setSequence(sequence: ArrayList<String>)

    abstract fun getCarModel(): CarModel

}

class BenzBuilder : CarBuilder() {

    private val benz = BenzModel()

    override fun setSequence(sequence: ArrayList<String>) {
        benz.setSequence(sequence)
    }

    override fun getCarModel(): CarModel {
        return benz
    }
}

class BMWBuilder : CarBuilder() {

    private val bmw = BMWModel()

    override fun setSequence(sequence: ArrayList<String>) {
        bmw.setSequence(sequence)
    }

    override fun getCarModel(): CarModel {
        return bmw
    }
}







