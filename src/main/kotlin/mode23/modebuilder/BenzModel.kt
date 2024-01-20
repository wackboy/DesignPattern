package mode23.modebuilder

/**
 * 建造者模式可以参考retrofit
 */
class BenzModel : CarModel() {
    override fun start() {
        println("奔驰启动")
    }

    override fun stop() {
        println("奔驰停车")
    }

    override fun alarm() {
        println("奔驰喇叭")
    }

    override fun engineBoom() {
        println("奔驰引擎发动")
    }

}

class BMWModel : CarModel() {
    override fun start() {
        println("BMW启动")
    }

    override fun stop() {
        println("BMW停车")
    }

    override fun alarm() {
        println("BMW喇叭")
    }

    override fun engineBoom() {
        println("BMW引擎发动")
    }
}

fun main() {
    val benz = BenzModel()
    val sequence = arrayListOf<String>(
        "Start", "stop"
    )
    benz.setSequence(sequence)
    benz.run()

    val bmwBuilder = BMWBuilder()
    bmwBuilder.setSequence(sequence)
    val bmw = bmwBuilder.getCarModel()
    bmw.run()


}

